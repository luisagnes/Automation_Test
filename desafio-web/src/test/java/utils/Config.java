package utils;

public class Config {
    public static String get(String key, String defaultValue){
        String sys = System.getProperty(key.toUpperCase().replace('.', '_'));
        if (sys != null && !sys.isBlank()) return sys;
        String env = System.getenv(key.toUpperCase().replace('.', '_'));
        if (env != null && !env.isBlank()) return env;

        java.util.Properties props = new java.util.Properties();
        try (var is = Config.class.getClassLoader().getResourceAsStream("config.properties")){
            if (is != null) props.load(is);
        } catch (Exception ignored){}
        return props.getProperty(key, defaultValue);
    }

    public static String baseUrl(){
        return get("baseUrl", "https://automationexercise.com/");
    }
    public static String loginEmail(){
        return get("loginEmail", "testeQA2025_005@teste.com.br");
    }
    public static String loginPassword(){
        return get("loginPassword", "124578Teste");
    }
    public static boolean headless(){
        return Boolean.parseBoolean(get("headless", "true"));
    }
    public static String browser(){
        return get("browser", "chrome");
    }
}
