package news.cyprus.com.retrofit_example.Service;

/**
 * Created by sreelal on 6/12/17.
 */


public class RestBuilderPro {
    private static ApiInterface service;
    public static ApiInterface getService()
    {
        service=ServiceGeneratorpro.createService(ApiInterface.class);
        return service;
    }
}