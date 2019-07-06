package rayhan.dev.androidnearbyplaces;

import rayhan.dev.androidnearbyplaces.Remote.IGoogleAPIService;
import rayhan.dev.androidnearbyplaces.Remote.RetrofitClient;
import retrofit2.Retrofit;
import retrofit2.http.GET;

public class Common {

    private static final String Google_API_URL = "https://maps.googleapis.com/";

    public static IGoogleAPIService getGoogleAPIService()
    {
        return RetrofitClient.getClient(Google_API_URL).create(IGoogleAPIService.class);
    }
}
