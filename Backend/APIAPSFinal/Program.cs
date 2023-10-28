var builder = WebApplication.CreateBuilder(args);

ConfigureServices(builder.Services);

var app = builder.Build();

app.UseCors("MyAllowedOrigins");

if (app.Environment.IsDevelopment())
{
    app.UseDeveloperExceptionPage();
    app.UseSwagger();
    app.UseSwaggerUI();
}

app.UseAuthorization();
app.MapControllers();

app.Run();

static void ConfigureServices(IServiceCollection services)
{
    services.AddControllers();
    services.AddEndpointsApiExplorer();
    services.AddSwaggerGen();

    // Configurar a política CORS aqui
    services.AddCors(options =>
    {
        options.AddPolicy("MyAllowedOrigins", builder =>
        {
            builder
            .WithOrigins("*")
            .AllowAnyHeader()
            .AllowAnyMethod();
        });
    });
}