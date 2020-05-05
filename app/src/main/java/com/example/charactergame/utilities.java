package com.example.charactergame;
/**
 import android.content.Context;
 import android.content.Intent;
 import android.net.Uri;

 import java.io.IOException;
 import java.io.InputStream;
 import java.io.InputStreamReader;
 import java.net.URL;
 import java.net.URLConnection;
 import java.nio.charset.Charset;
 */
public class utilities {
    /**
     * // Number of urls that is going to be passed into AsyncTask
     * private static final int NUM_OF_URLS = 5;
     * // Number of results shown per one search in  api.
     * private static final int INCREASE_BY = 20;
     * <p>
     * // Key query that get the starting position of the restaurant
     * // that need to be shown in the search result
     * private static final String STARTING_INDEX = "start";
     * <p>
     * // For searching locations on the map
     * private static final String GEO_SCHEME = "geo:0,0?";
     * private static final String QUERY_PARAM = "q=";
     * private static final String ZOOM_FACTOR = "z=18";
     */

    private String pokeUrl = "https://pokeapi.co/api/v2/pokmon/";
    private String baseUrl = "https://pokeapi.co/api/v2/pokemon/?limit=150";

    public utilities(int pokeNum) {
        pokeUrl += pokeNum;
    }
}


//
///**
//    /**
//     * Make a connection with the url and receive the response in input stream.
//     * @param inputUrl destination url
//     * @return data from the inputUrl
//     * @throws IOException exception that can caused by bad networking
//     */
//    public static InputStreamReader getInputFromUrl(String inputUrl) throws IOException{
//        try {
//            URL zomatoUrl = new URL(inputUrl);
//
//            URLConnection connection = zomatoUrl.openConnection();
//            connection.setRequestProperty("user-key", ZomatoAPI.API_KEY);
//            connection.connect();
//
//            InputStream inStream = connection.getInputStream();
//            return new InputStreamReader(inStream, Charset.forName("UTF-8"));
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        return null;
//    }
//
//    /**
//     * Use the base URL to make duplicate URLs with 'start' value
//     * @return array of generated URL
//     */
//    public String[] generateMultipleSearchUrl() {
//        String[] urlArray = new String[NUM_OF_URLS];
//        int index = 0;
//        for (int i = 0; i < urlArray.length; i++) {
//            urlArray[i] = baseUrl + "&" + STARTING_INDEX + "=" + index;
//            index += INCREASE_BY;
//        }
//        return urlArray;
//    }
//
//    /**
//     * With the given restaurant, open the map to locate the restaurant.
//     * @param context context of detaied view
//     * @param restaurant corresponding restaurant object
//     */
//    public static void openMap(Context context, Restaurant restaurant) {
//        String addressString = GEO_SCHEME + QUERY_PARAM + restaurant.getLocation().getAddress() + "&" + ZOOM_FACTOR;
//        Uri addressUri = Uri.parse(addressString);
//        Intent intent = new Intent(Intent.ACTION_VIEW);
//        intent.setData(addressUri);
//        if (intent.resolveActivity(context.getPackageManager()) != null) {
//            context.startActivity(intent);
//        }
//    }
//
//    /**
//     * With the given URL, open the web page of the restaurant.
//     * @param context context of detailed view
//     * @param restaurant restaurant of the detailed view
//     */
//    public static void openWebPage(Context context, Restaurant restaurant) {
//        Uri webPageUri = Uri.parse(restaurant.getUrl());
//        Intent intent = new Intent(Intent.ACTION_VIEW, webPageUri);
//        if (intent.resolveActivity(context.getPackageManager()) != null) {
//            context.startActivity(intent);
//        }
//    }
//
//}
//*/