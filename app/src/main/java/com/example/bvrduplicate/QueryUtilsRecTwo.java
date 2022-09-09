package com.example.bvrduplicate;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;

// This class belong to recyclerView2 of Homepage.

public class QueryUtilsRecTwo {

    private static final String SAMPLE_JSON_RESPONSE = "{\n" +
            "    \"id\": 2,\n" +
            "    \"nav_paragraph\": \"Spring Time Special\",\n" +
            "    \"nav_image\": \"catalog/images/header_flower_opt.svg\",\n" +
            "    \"cat_event_background\": \"background: linear-gradient(\\r\\n0deg\\r\\n, #FFEAEA 37.5%, #FFD1CF 100%);\",\n" +
            "    \"cat_event_name\": \"It’s Spring Time!\",\n" +
            "    \"cat_event_color\": \"    color: #000000;\",\n" +
            "    \"cat_event_specs_color\": \"    color: #000000;\\r\\n\",\n" +
            "    \"cat_event_arrow_color\": \"    color: #000000;\\r\\n\",\n" +
            "    \"cat_event_border_bottom\": \"border-bottom: 1px solid rgba(0, 0, 0, 0.08);\",\n" +
            "    \"cat_event_image\": \"catalog/images/event_flower_opt.svg\",\n" +
            "    \"left_category\": \"[224,1938,1876,1644]\",\n" +
            "    \"right_category\": \"[1908,1707,214,3,87,9]\",\n" +
            "    \"banner_background\": \"    background-color: #FFEAEA;\\r\\n\",\n" +
            "    \"banner_paragraph\": \" Looking to shop some amazing stuff in this Spring Time \",\n" +
            "    \"banner_color\": \"    color: #522B0A;\\r\\n\",\n" +
            "    \"small_banner_image\": \"catalog/images/footer_flower_opt.svg\",\n" +
            "    \"banner_btn_color\": null,\n" +
            "    \"banner_btn_over\": \"this.style.backgroundColor=\\\"#000000\\\"; this.style.color=\\\"#fff\\\";  \\r\\n\\r\\n\",\n" +
            "    \"banner_btn_out\": \"this.style.backgroundColor=\\\"transparent\\\"; this.style.color=\\\"#000000\\\";  \\r\\n\\r\\n\",\n" +
            "    \"banner_btn_border\": \"color:343a40\",\n" +
            "    \"bigger_banner_image\": \"catalog/images/spring_large_opt.svg\",\n" +
            "    \"feature\": \"0\",\n" +
            "    \"updated_at\": \"2021-03-18T13:00:56Z\",\n" +
            "    \"blog_url\": \"/blog/spring-gifts-things-to-buy-this-spring/\",\n" +
            "    \"blog_url_event\": null,\n" +
            "    \"left_category_data\": [\n" +
            "        {\n" +
            "            \"category_slug\": \"womens-dresses\",\n" +
            "            \"label\": \"Women's Dresses\",\n" +
            "            \"total_reviews\": 401266,\n" +
            "            \"updated_at\": \"2022-08-21T11:26:47.848087Z\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"category_slug\": \"womens-fragrances\",\n" +
            "            \"label\": \"Women's Fragrances\",\n" +
            "            \"total_reviews\": 227104,\n" +
            "            \"updated_at\": \"2022-08-06T18:51:01.796203Z\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"category_slug\": \"men-fedoras\",\n" +
            "            \"label\": \"Men Fedoras\",\n" +
            "            \"total_reviews\": 45168,\n" +
            "            \"updated_at\": \"2022-08-22T06:33:05.893191Z\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"category_slug\": \"womens-pumps-shoes\",\n" +
            "            \"label\": \"Women's Pumps Shoes\",\n" +
            "            \"total_reviews\": 96895,\n" +
            "            \"updated_at\": \"2022-07-22T13:24:40.292298Z\"\n" +
            "        }\n" +
            "    ],\n" +
            "    \"right_category_data\": [\n" +
            "        {\n" +
            "            \"category_slug\": \"boxed-chocolates\",\n" +
            "            \"label\": \"Boxed Chocolates\",\n" +
            "            \"product_image_url\": \"https://m.media-amazon.com/images/I/51CFwi9sUML._SL500_.jpg\",\n" +
            "            \"total_reviews\": 29399,\n" +
            "            \"updated_at\": \"2022-08-18T05:25:45.604164Z\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"category_slug\": \"smartwatches\",\n" +
            "            \"label\": \"Smartwatches\",\n" +
            "            \"product_image_url\": \"https://m.media-amazon.com/images/I/41EIyco72mL._SL500_.jpg\",\n" +
            "            \"total_reviews\": 582407,\n" +
            "            \"updated_at\": \"2022-08-24T13:50:52.790732Z\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"category_slug\": \"wine-chiller\",\n" +
            "            \"label\": \"Wine Chillers\",\n" +
            "            \"product_image_url\": \"https://m.media-amazon.com/images/I/31kV2Tuh6YL._SL500_.jpg\",\n" +
            "            \"total_reviews\": 8874,\n" +
            "            \"updated_at\": \"2022-08-23T11:15:22.915664Z\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"category_slug\": \"dinnerware-and-serveware\",\n" +
            "            \"label\": \"Dinnerware & Serveware Sets\",\n" +
            "            \"product_image_url\": \"https://m.media-amazon.com/images/I/51R5h+TXNCL._SL500_.jpg\",\n" +
            "            \"total_reviews\": 85176,\n" +
            "            \"updated_at\": \"2022-08-26T13:46:53.897501Z\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"category_slug\": \"building-toys\",\n" +
            "            \"label\": \"Building Toys\",\n" +
            "            \"product_image_url\": \"https://m.media-amazon.com/images/I/51dfbsjyfOL._SL500_.jpg\",\n" +
            "            \"total_reviews\": 123088,\n" +
            "            \"updated_at\": \"2022-08-10T05:43:11.069593Z\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"category_slug\": \"wine-glasses\",\n" +
            "            \"label\": \"Wine Glasses\",\n" +
            "            \"product_image_url\": \"https://m.media-amazon.com/images/I/51HuKa1gohL._SL500_.jpg\",\n" +
            "            \"total_reviews\": 94625,\n" +
            "            \"updated_at\": \"2022-04-21T17:05:07.327560Z\"\n" +
            "        }\n" +
            "    ]\n" +
            "}";

    public QueryUtilsRecTwo() {
    }

    public static ArrayList<DataModelTwo> extractDataModelTwo() {

        ArrayList<DataModelTwo> dataModelesTwo = new ArrayList<>();

    try{

        JSONObject baseJsonResponse = new JSONObject(SAMPLE_JSON_RESPONSE);

        JSONArray jsonArray = baseJsonResponse.getJSONArray("right_category_data");

        for (int i = 0; i < jsonArray.length(); i++) {
            JSONObject jsonObject = jsonArray.getJSONObject(i);

            String productName =jsonObject.getString("label");

            String numberOfReview=jsonObject.getString("total_reviews");
            String image=  jsonObject.getString("product_image_url");

          DataModelTwo dataModelTwo = new DataModelTwo(productName, numberOfReview,image);
          dataModelesTwo.add(dataModelTwo);
        }


    } catch (Exception e) {
        e.printStackTrace();
    }

    return dataModelesTwo;

    }


}
