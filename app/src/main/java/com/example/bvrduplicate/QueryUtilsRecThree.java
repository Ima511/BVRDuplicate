package com.example.bvrduplicate;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.json.JSONArray;
import org.json.JSONObject;


import java.util.ArrayList;

public class QueryUtilsRecThree {

    // Sample JSON for data loading on Home Screen

    private static final String SAMPLE_JSON_RESPONSE = "[\n" +
            "    {\n" +
            "        \"large_image_snippet\": \"https://m.media-amazon.com/images/I/513kQK6QuIS._SL500_.jpg\",\n" +
            "        \"product__id\": 432141,\n" +
            "        \"product__category_id\": 43,\n" +
            "        \"features\": [\n" +
            "            {\n" +
            "                \"title\": \"Build Quality\",\n" +
            "                \"rating\": 9.5\n" +
            "            },\n" +
            "            {\n" +
            "                \"title\": \"Controls and Functionality\",\n" +
            "                \"rating\": 9.5\n" +
            "            },\n" +
            "            {\n" +
            "                \"title\": \"Convenience\",\n" +
            "                \"rating\": 9.5\n" +
            "            },\n" +
            "            {\n" +
            "                \"title\": \"Customer Support\",\n" +
            "                \"rating\": 9.4\n" +
            "            }\n" +
            "        ],\n" +
            "        \"active\": true,\n" +
            "        \"name\": \"        Portable Air Conditioner, Personal Air Cooler Auto Oscillation with 3 Wind Speeds,2 Refrigeration,Ice Cooler Fan for Indoor Outdoor        ; Brand: Generic\",\n" +
            "        \"label\": \"Generic Portable Air Conditioner, Personal Air Cooler Auto Oscillation with 3 Wind Speeds\",\n" +
            "        \"total_reviews_count\": 44,\n" +
            "        \"score_out_of_10\": 9.830289000352483,\n" +
            "        \"product_slug\": \"portable-air-conditioner-personal-air-cooler-auto-oscillation-with-3-wind-speeds2-refrigerationice-cooler-fan-for-indoor-outdoor-brand-generic\",\n" +
            "        \"buy_url\": \"http://www.amazon.com/dp/B09XHQJSWZ/?tag=bestviewsre0e-20\",\n" +
            "        \"pros_cons\": {\n" +
            "            \"pros\": [\n" +
            "                \"Comes with 3 adjustable wind speeds and 2 mist output levels that helps meet varied cooling/misting needs\",\n" +
            "                \"Built-in 700ml large capacity water tank helps to continuously blow cool wind for several hours\",\n" +
            "                \"Features a portable design with built-in handle that makes it easy to move \"\n" +
            "            ],\n" +
            "            \"cons\": [\n" +
            "                \"May take time to cool the room\"\n" +
            "            ]\n" +
            "        }\n" +
            "    },\n" +
            "    {\n" +
            "        \"large_image_snippet\": \"https://m.media-amazon.com/images/I/41uhlvMzczL._SL500_.jpg\",\n" +
            "        \"product__id\": 139385,\n" +
            "        \"product__category_id\": 43,\n" +
            "        \"features\": [\n" +
            "            {\n" +
            "                \"title\": \"Build Quality\",\n" +
            "                \"rating\": 9.1\n" +
            "            },\n" +
            "            {\n" +
            "                \"title\": \"Controls and Functionality\",\n" +
            "                \"rating\": 8.9\n" +
            "            },\n" +
            "            {\n" +
            "                \"title\": \"Convenience\",\n" +
            "                \"rating\": 9.1\n" +
            "            },\n" +
            "            {\n" +
            "                \"title\": \"Customer Support\",\n" +
            "                \"rating\": 8.9\n" +
            "            }\n" +
            "        ],\n" +
            "        \"active\": true,\n" +
            "        \"name\": \"Evaporative Air Cooler, 3-in-1 Portable Air Conditioner Fan with Remote Control, Cooling & Humidify with 3 Speeds, 4 Wind Mode, LED Display, Timer, Bladeless Fan for Large Room Office\",\n" +
            "        \"label\": \"Evaporative Air Cooler, 3-in-1 Portable Air Conditioner Fan with Remote Control\",\n" +
            "        \"total_reviews_count\": 135,\n" +
            "        \"score_out_of_10\": 9.817824069253817,\n" +
            "        \"product_slug\": \"evaporative-air-cooler-3-in-1-portable-air-conditioner-fan-with-remote-control-cooling-humidify-with-3-speeds-4-wind-mode-led-display-timer-bladeless-fan-for-large-room-office\",\n" +
            "        \"buy_url\": \"http://www.amazon.com/dp/B09BNBSHVF/?tag=bestviewsre0e-20\",\n" +
            "        \"pros_cons\": {\n" +
            "            \"pros\": [\n" +
            "                \"Comes with 3 speed settings that allow to customize it according to the desire\",\n" +
            "                \"Built-in LED display shows the current temperature of the home\",\n" +
            "                \"Equipped with remote control to easily set the time, speed and mode from across the room\"\n" +
            "            ],\n" +
            "            \"cons\": [\n" +
            "                \"The atomizer may not function adequately at times\"\n" +
            "            ]\n" +
            "        }\n" +
            "    },\n" +
            "    {\n" +
            "        \"large_image_snippet\": \"https://m.media-amazon.com/images/I/31QQ1jsQBeL._SL500_.jpg\",\n" +
            "        \"product__id\": 80010,\n" +
            "        \"product__category_id\": 43,\n" +
            "        \"features\": [\n" +
            "            {\n" +
            "                \"title\": \"Build Quality\",\n" +
            "                \"rating\": 8.6\n" +
            "            },\n" +
            "            {\n" +
            "                \"title\": \"Controls and Functionality\",\n" +
            "                \"rating\": 8.6\n" +
            "            },\n" +
            "            {\n" +
            "                \"title\": \"Convenience\",\n" +
            "                \"rating\": 8.8\n" +
            "            },\n" +
            "            {\n" +
            "                \"title\": \"Customer Support\",\n" +
            "                \"rating\": 9.1\n" +
            "            }\n" +
            "        ],\n" +
            "        \"active\": true,\n" +
            "        \"name\": \"Skywalker Trampolines Wind Stakes – 4 Pack\",\n" +
            "        \"label\": \"COSTWAY 12000 BTU Portable Air Conditioner\",\n" +
            "        \"total_reviews_count\": 873,\n" +
            "        \"score_out_of_10\": 9.800926297151479,\n" +
            "        \"product_slug\": \"skywalker-trampolines-wind-stakes-4-pack\",\n" +
            "        \"buy_url\": \"http://www.amazon.com/dp/B07SY8R65G/?tag=bestviewsre0e-20\",\n" +
            "        \"pros_cons\": {\n" +
            "            \"pros\": [\n" +
            "                \"Equipped with legs that makes it easy to install and maneuver\",\n" +
            "                \"Features safety mechanism that helps to stabilize trampoline during storms\",\n" +
            "                \"Comes in a versatile design that makes it suitable for various spaces\"\n" +
            "            ],\n" +
            "            \"cons\": [\n" +
            "                \"Trampoline may be of delicate quality\"\n" +
            "            ]\n" +
            "        }\n" +
            "    },\n" +
            "    {\n" +
            "        \"large_image_snippet\": \"https://m.media-amazon.com/images/I/31j5Su48uAL._SL500_.jpg\",\n" +
            "        \"product__id\": 432094,\n" +
            "        \"product__category_id\": 43,\n" +
            "        \"features\": [\n" +
            "            {\n" +
            "                \"title\": \"Build Quality\",\n" +
            "                \"rating\": 9.8\n" +
            "            },\n" +
            "            {\n" +
            "                \"title\": \"Controls and Functionality\",\n" +
            "                \"rating\": 9.7\n" +
            "            },\n" +
            "            {\n" +
            "                \"title\": \"Convenience\",\n" +
            "                \"rating\": 9.8\n" +
            "            },\n" +
            "            {\n" +
            "                \"title\": \"Customer Support\",\n" +
            "                \"rating\": 9.7\n" +
            "            }\n" +
            "        ],\n" +
            "        \"active\": true,\n" +
            "        \"name\": \"        EUHOMY 14,000 BTU Portable Air Conditioner with Built-in Dehumidifier & Fan Modes, Dual motor Portable Ac Unit,Quiet Operation,Includes Remote Control, Floor Air Conditioner With Window Installation Kit for Rooms up to 450 sq ft， White        ; Visit the E EUHOMY Store\",\n" +
            "        \"label\": \"EUHOMY 14,000 BTU Portable Air Conditioner\",\n" +
            "        \"total_reviews_count\": 138,\n" +
            "        \"score_out_of_10\": 9.73053450008672,\n" +
            "        \"product_slug\": \"euhomy-14000-btu-portable-air-conditioner-with-built-in-dehumidifier-fan-modes-dual-motor-portable-ac-unitquiet-operationincludes-remote-control-floor-air-conditioner-with-window-installation-kit-for-rooms-up-to-450-sq-ft-white-visit-the-e-euhomy-store\",\n" +
            "        \"buy_url\": \"http://www.amazon.com/dp/B08XVFP7TG/?tag=bestviewsre0e-20\",\n" +
            "        \"pros_cons\": {\n" +
            "            \"pros\": [\n" +
            "                \"14000 BTU delivers fast and effective cooling for spaces up to 450 sq.ft\",\n" +
            "                \"Comes with a multi-function remote control that offers convenient operation from across the room\",\n" +
            "                \"Features a self-evaporation system that effectively reduces drainage operation\"\n" +
            "            ],\n" +
            "            \"cons\": [\n" +
            "                \"Sometimes may release burning-like smell during operation\"\n" +
            "            ]\n" +
            "        }\n" +
            "    },\n" +
            "    {\n" +
            "        \"large_image_snippet\": \"https://m.media-amazon.com/images/I/41WX7CQuQXL._SL500_.jpg\",\n" +
            "        \"product__id\": 377122,\n" +
            "        \"product__category_id\": 43,\n" +
            "        \"features\": [\n" +
            "            {\n" +
            "                \"title\": \"Build Quality\",\n" +
            "                \"rating\": 9.6\n" +
            "            },\n" +
            "            {\n" +
            "                \"title\": \"Controls and Functionality\",\n" +
            "                \"rating\": 9.6\n" +
            "            },\n" +
            "            {\n" +
            "                \"title\": \"Convenience\",\n" +
            "                \"rating\": 9.6\n" +
            "            },\n" +
            "            {\n" +
            "                \"title\": \"Customer Support\",\n" +
            "                \"rating\": 9.6\n" +
            "            }\n" +
            "        ],\n" +
            "        \"active\": true,\n" +
            "        \"name\": \"        Evaporative Air Cooler - COMFYHOME 3-in-1 43 Portable Air Conditioner & Tower Fan w/Cooling, 1-Gal Water Tank, 3 Speeds+4 Modes, 70° Oscillation, 15H Timer, Remote Control for Home Office Bedroom       \\\" ; Visit the COMFYHOME Store\",\n" +
            "        \"label\": \"COMFYHOME 3-in-1 43 Portable Air Conditioner & Tower Fan w/Cooling\",\n" +
            "        \"total_reviews_count\": 56,\n" +
            "        \"score_out_of_10\": 9.723006538072706,\n" +
            "        \"product_slug\": \"evaporative-air-cooler-comfyhome-3-in-1-43-portable-air-conditioner-tower-fan-wcooling-1-gal-water-tank-3-speeds4-modes-70-oscillation-15h-timer-remote-control-for-home-office-bedroom-visit-the-comfyhome-store\",\n" +
            "        \"buy_url\": \"http://www.amazon.com/dp/B09M3QRC2S/?tag=bestviewsre0e-20\",\n" +
            "        \"pros_cons\": {\n" +
            "            \"pros\": [\n" +
            "                \"Comes with 4 modes and 3 speed levels that helps meet varied cooling needs\",\n" +
            "                \"Features 1.05 gallon large water tank that offers long run time while preventing the need to refill often\",\n" +
            "                \"Made of high-quality material that offers an extended durability\"\n" +
            "            ],\n" +
            "            \"cons\": [\n" +
            "                \"The appliance may leak \"\n" +
            "            ]\n" +
            "        }\n" +
            "    },\n" +
            "    {\n" +
            "        \"large_image_snippet\": \"https://m.media-amazon.com/images/I/51-VyOvo25L._SL500_.jpg\",\n" +
            "        \"product__id\": 139373,\n" +
            "        \"product__category_id\": 43,\n" +
            "        \"features\": [\n" +
            "            {\n" +
            "                \"title\": \"Build Quality\",\n" +
            "                \"rating\": 8.9\n" +
            "            },\n" +
            "            {\n" +
            "                \"title\": \"Controls and Functionality\",\n" +
            "                \"rating\": 8.8\n" +
            "            },\n" +
            "            {\n" +
            "                \"title\": \"Convenience\",\n" +
            "                \"rating\": 8.9\n" +
            "            },\n" +
            "            {\n" +
            "                \"title\": \"Customer Support\",\n" +
            "                \"rating\": 9.0\n" +
            "            }\n" +
            "        ],\n" +
            "        \"active\": true,\n" +
            "        \"name\": \"2021Upgraded Personal Air Conditioner, Desk Portable Air Conditioner Fan, Mini Air Conditioner with Remote, Misting Small Portable Air Conditioner, Mini Air Cooler\",\n" +
            "        \"label\": \"OYRGCIK 2021Upgraded Personal Air Conditioner\",\n" +
            "        \"total_reviews_count\": 235,\n" +
            "        \"score_out_of_10\": 9.714703101341833,\n" +
            "        \"product_slug\": \"2021upgraded-personal-air-conditioner-desk-portable-air-conditioner-fan-mini-air-conditioner-with-remote-misting-small-portable-air-conditioner-mini-air-cooler-0\",\n" +
            "        \"buy_url\": \"http://www.amazon.com/dp/B09123LSZR/?tag=bestviewsre0e-20\",\n" +
            "        \"pros_cons\": {\n" +
            "            \"pros\": [\n" +
            "                \" Equipped with a portable handle that makes it easy to move anywhere \",\n" +
            "                \"Features 600ml large water tank that  provides misting for longer time\",\n" +
            "                \"Built-in 3 different speed mode that meet various requirements\"\n" +
            "            ],\n" +
            "            \"cons\": [\n" +
            "                \"May be too small in size\"\n" +
            "            ]\n" +
            "        }\n" +
            "    },\n" +
            "    {\n" +
            "        \"large_image_snippet\": \"https://m.media-amazon.com/images/I/410iJdYeIZL._SL500_.jpg\",\n" +
            "        \"product__id\": 432128,\n" +
            "        \"product__category_id\": 43,\n" +
            "        \"features\": [\n" +
            "            {\n" +
            "                \"title\": \"Build Quality\",\n" +
            "                \"rating\": 9.3\n" +
            "            },\n" +
            "            {\n" +
            "                \"title\": \"Controls and Functionality\",\n" +
            "                \"rating\": 9.3\n" +
            "            },\n" +
            "            {\n" +
            "                \"title\": \"Convenience\",\n" +
            "                \"rating\": 9.4\n" +
            "            },\n" +
            "            {\n" +
            "                \"title\": \"Customer Support\",\n" +
            "                \"rating\": 9.2\n" +
            "            }\n" +
            "        ],\n" +
            "        \"active\": true,\n" +
            "        \"name\": \"        MiKoSoRu Portable Air Conditioner, Personal Evaporative Cooler with 7 Color LED Light, Timer, Spray and 3 Speeds, Small Desktop Cooling Humidifier Fan for Bedroom        ; Brand: MiKoSoRu\",\n" +
            "        \"label\": \"MiKoSoRu Portable Air Conditioner, Personal Evaporative Cooler\",\n" +
            "        \"total_reviews_count\": 101,\n" +
            "        \"score_out_of_10\": 9.701971114881346,\n" +
            "        \"product_slug\": \"mikosoru-portable-air-conditioner-personal-evaporative-cooler-with-7-color-led-light-timer-spray-and-3-speeds-small-desktop-cooling-humidifier-fan-for-bedroom-brand-mikosoru\",\n" +
            "        \"buy_url\": \"http://www.amazon.com/dp/B09T6QNZB3/?tag=bestviewsre0e-20\",\n" +
            "        \"pros_cons\": {\n" +
            "            \"pros\": [\n" +
            "                \"Built-in water tank and high-speed motor provide cool moist air and creates a comfortable summer environment\",\n" +
            "                \"Comes with 3 speed levels that helps meet varied cooling needs\",\n" +
            "                \"Features a compact design that makes it easy to place and port adequately\"\n" +
            "            ],\n" +
            "            \"cons\": [\n" +
            "                \"Tank capacity may vary\"\n" +
            "            ]\n" +
            "        }\n" +
            "    },\n" +
            "    {\n" +
            "        \"large_image_snippet\": \"https://m.media-amazon.com/images/I/41iMCPXDiWL._SL500_.jpg\",\n" +
            "        \"product__id\": 65176,\n" +
            "        \"product__category_id\": 43,\n" +
            "        \"features\": [\n" +
            "            {\n" +
            "                \"title\": \"Build Quality\",\n" +
            "                \"rating\": 8.8\n" +
            "            },\n" +
            "            {\n" +
            "                \"title\": \"Controls and Functionality\",\n" +
            "                \"rating\": 8.8\n" +
            "            },\n" +
            "            {\n" +
            "                \"title\": \"Convenience\",\n" +
            "                \"rating\": 8.8\n" +
            "            },\n" +
            "            {\n" +
            "                \"title\": \"Customer Support\",\n" +
            "                \"rating\": 8.9\n" +
            "            }\n" +
            "        ],\n" +
            "        \"active\": true,\n" +
            "        \"name\": \"        BREEZEWELL 3-IN-1 Evaporative Air Cooler, Portable Air Conditioner Fan/Humidifier with Ice Box, 12H Timer&Remote Control,Ultra-quiet,65° Oscillating Personal Evaporative Cooler for Room Home & Office        ; Visit the BREEZEWELL Store\",\n" +
            "        \"label\": \"BREEZEWELL 3-IN-1 Portable Air Conditioner\",\n" +
            "        \"total_reviews_count\": 564,\n" +
            "        \"score_out_of_10\": 9.68127804398537,\n" +
            "        \"product_slug\": \"breezewell-3-in-1-portable-air-conditioner-evaporative-air-coolerhumidifiercooling-w-ice-box-12h-timerremote-control-ultra-quiet-65-oscillating-evaporative-cooler-for-whole-room-home-office\",\n" +
            "        \"buy_url\": \"http://www.amazon.com/dp/B08QHPTNH4/?tag=bestviewsre0e-20\",\n" +
            "        \"pros_cons\": {\n" +
            "            \"pros\": [\n" +
            "                \"Equipped with a remote control that makes it easy to operate\",\n" +
            "                \"Features 3 adjustable speed that offers perfect cooling according to convenience\",\n" +
            "                \"Comes with 3 modes that makes it suitable for all both hot and humid weather\"\n" +
            "            ],\n" +
            "            \"cons\": [\n" +
            "                \"May not have a way to dump out the water from the tank\"\n" +
            "            ]\n" +
            "        }\n" +
            "    },\n" +
            "    {\n" +
            "        \"large_image_snippet\": \"https://m.media-amazon.com/images/I/41p1kuJ4uBL._SL500_.jpg\",\n" +
            "        \"product__id\": 432127,\n" +
            "        \"product__category_id\": 43,\n" +
            "        \"features\": [\n" +
            "            {\n" +
            "                \"title\": \"Build Quality\",\n" +
            "                \"rating\": 9.7\n" +
            "            },\n" +
            "            {\n" +
            "                \"title\": \"Controls and Functionality\",\n" +
            "                \"rating\": 9.7\n" +
            "            },\n" +
            "            {\n" +
            "                \"title\": \"Convenience\",\n" +
            "                \"rating\": 9.7\n" +
            "            },\n" +
            "            {\n" +
            "                \"title\": \"Customer Support\",\n" +
            "                \"rating\": 9.7\n" +
            "            }\n" +
            "        ],\n" +
            "        \"active\": true,\n" +
            "        \"name\": \"        EUHOMY 8000 BTU Portable Air Conditioner Dehumidifier, Portable Ac Unit With Remote Control, Floor Air Conditioner With Window Installation Kit For Room, Office, Dorm, Bedroom, White        ; Visit the E EUHOMY Store\",\n" +
            "        \"label\": \"EUHOMY 8000 BTU Portable Air Conditioner Dehumidifier\",\n" +
            "        \"total_reviews_count\": 119,\n" +
            "        \"score_out_of_10\": 9.672898237739272,\n" +
            "        \"product_slug\": \"euhomy-8000-btu-portable-air-conditioner-dehumidifier-portable-ac-unit-with-remote-control-floor-air-conditioner-with-window-installation-kit-for-room-office-dorm-bedroom-white-visit-the-e-euhomy-store\",\n" +
            "        \"buy_url\": \"http://www.amazon.com/dp/B09T36J4HP/?tag=bestviewsre0e-20\",\n" +
            "        \"pros_cons\": {\n" +
            "            \"pros\": [\n" +
            "                \"Offers 8000 BTUs of cool air that makes it suitable for spaces up to 250 sq.ft.\",\n" +
            "                \"Comes with adjustable fan speed levels that helps meet varied cooling needs\",\n" +
            "                \"Equipped with LED display and remote control design that makes it easy to operate \"\n" +
            "            ],\n" +
            "            \"cons\": [\n" +
            "                \"May make a loud operating sound\"\n" +
            "            ]\n" +
            "        }\n" +
            "    },\n" +
            "    {\n" +
            "        \"large_image_snippet\": \"https://m.media-amazon.com/images/I/51CZWrXK8aL._SL500_.jpg\",\n" +
            "        \"product__id\": 139383,\n" +
            "        \"product__category_id\": 43,\n" +
            "        \"features\": [\n" +
            "            {\n" +
            "                \"title\": \"Build Quality\",\n" +
            "                \"rating\": 8.8\n" +
            "            },\n" +
            "            {\n" +
            "                \"title\": \"Controls and Functionality\",\n" +
            "                \"rating\": 8.8\n" +
            "            },\n" +
            "            {\n" +
            "                \"title\": \"Convenience\",\n" +
            "                \"rating\": 8.7\n" +
            "            },\n" +
            "            {\n" +
            "                \"title\": \"Customer Support\",\n" +
            "                \"rating\": 9.4\n" +
            "            }\n" +
            "        ],\n" +
            "        \"active\": true,\n" +
            "        \"name\": \"Portable Air Conditioner, Rechargeable Evaporative Air Conditioner Fan with 3 Speeds 7 Colors, Cordless Personal Air Cooler with Handle for Home, Office and Room\",\n" +
            "        \"label\": \"Portable Air Conditioner, Rechargeable Evaporative Air Conditioner Fan with 3 Speeds 7 Colors\",\n" +
            "        \"total_reviews_count\": 366,\n" +
            "        \"score_out_of_10\": 9.663429478340701,\n" +
            "        \"product_slug\": \"portable-air-conditioner-rechargeable-evaporative-air-conditioner-fan-with-3-speeds-7-colors-cordless-personal-air-cooler-with-handle-for-home-office-and-room\",\n" +
            "        \"buy_url\": \"http://www.amazon.com/dp/B0992BYDLJ/?tag=bestviewsre0e-20\",\n" +
            "        \"pros_cons\": {\n" +
            "            \"pros\": [\n" +
            "                \"Comes in a compact size that makes it easy to carry\",\n" +
            "                \" Features 3 wind modes that meet varied requirements\",\n" +
            "                \"Equipped with 300ML large water tank that  can be used for 4-5 hours when fill it up\"\n" +
            "            ],\n" +
            "            \"cons\": [\n" +
            "                \"May take time to cool a room\"\n" +
            "            ]\n" +
            "        }\n" +
            "    }\n" +
            "]";


    public QueryUtilsRecThree() {

    }

    public static ArrayList<DataModelThree> extractDataModelThree(){

        ArrayList<DataModelThree> dataModelesThree = new ArrayList<>();
        ObjectMapper objectMapper = new ObjectMapper();


        try{
            JSONArray jsonArray = new JSONArray(SAMPLE_JSON_RESPONSE);
            JsonNode node = objectMapper.readValue(SAMPLE_JSON_RESPONSE, JsonNode.class);



        //   String tvFeatureOne = null;
//            String tvFeatureTwo = null;
//            String tvFeatureThree = null;
//            String tvFeatureFour = null;
//
//            String tvFeatureOneRatings = null;
//            String tvFeatureTwoRatings= null;
//            String tvFeatureThreeRatings = null;
//            String tvFeatureFourRatings = null;
//
//            String tvPros1 = null ;
//            String tvPros2 = null;
//            String tvPros3 = null ;
//
//            String tvCons1 = null;
            //Iterate the jsonArray and print the info of JSONObjects

            for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject jsonObject = jsonArray.getJSONObject(i);
//                JSONArray jsonFeature = jsonObject.getJSONArray("features");
//                JSONArray jsonPros = jsonObject.getJSONArray("pros");
//                JSONArray jsonCons = jsonObject.getJSONArray("cons");
//                JSONObject jsonFeatures = jsonObject.getJSONObject("features");
//                JSONArray jsonTitle = jsonFeatures.getJSONArray("title");
//
//                for (i =0;i<jsonTitle.length(); i++){
//                    JSONObject jsontitle = jsonTitle.getJSONObject(i);
//                    String tvFeatureOne = jsontitle.getString("title");
//                }
//
                String tvProductHeading = jsonObject.getString("label") ;

                // Labeling of all features
             String   tvFeatureOne = String.valueOf(jsonObject.getJSONArray("features").getJSONObject(0).getString("title"));
             String   tvFeatureTwo = String.valueOf(jsonObject.getJSONArray("features").getJSONObject(1).getString("title"));
             String   tvFeatureThree = String.valueOf(jsonObject.getJSONArray("features").getJSONObject(2).getString("title"));
             String   tvFeatureFour = String.valueOf(jsonObject.getJSONArray("features").getJSONObject(3).getString("title"));

             // Rating of all features
            double   tvFeatureOneRating = Double.parseDouble(jsonObject.getJSONArray("features").getJSONObject(0).getString("rating"));
            double  tvFeatureTwoRatings = Double.parseDouble(jsonObject.getJSONArray("features").getJSONObject(1).getString("rating"));
            double   tvFeatureThreeRatings = Double.parseDouble(jsonObject.getJSONArray("features").getJSONObject(2).getString("rating"));
            double  tvFeatureFourRatings = Double.parseDouble(jsonObject.getJSONArray("features").getJSONObject(3).getString("rating"));

            // Overall rating value == score out of 10
                double overAllRatingLong =  jsonObject.getDouble("score_out_of_10")*100;
                double overAllRatingDouble = (int )overAllRatingLong/10;
                double overAllRating = (double) overAllRatingDouble/10;

            //    Pros
                String tvPros1 = jsonObject.getJSONObject("pros_cons").getJSONArray("pros").getString(0);
                String tvPros2 = jsonObject.getJSONObject("pros_cons").getJSONArray("pros").getString(1);
                String tvPros3 = jsonObject.getJSONObject("pros_cons").getJSONArray("pros").getString(2);

            // Cons

            String tvCons1 = jsonObject.getJSONObject("pros_cons").getJSONArray("cons").getString(0);
//            double sumOfRatings = tvFeatureOneRating + tvFeatureTwoRatings + tvFeatureThreeRatings + tvFeatureFourRatings;
//            double overAllRatingLong = (sumOfRatings)/4 ;
//
//            double overAllRatingDouble = (int)(overAllRatingLong *10);
//            double overAllRating = overAllRatingDouble/10;

//                Long overAllRatingLong = (Long) jsonObject.get("score_out_of_10");
//                int overAllRatingDouble = (int) (overAllRatingLong * 100);
//                double overAllRating = (double) overAllRatingDouble/100;

              //  double overAllRating = overAllRatingDouble/10;




//                for (i = 0; i<jsonFeature.length(); i++){
//                    JSONObject jsonTitle = jsonFeature.getJSONObject(i);
//
//                     tvFeatureOne = jsonTitle.getString("title");
//                     tvFeatureTwo = jsonTitle.getString("title");
//                     tvFeatureThree = jsonTitle.getString("title");
//                     tvFeatureFour = jsonTitle.getString("title");
//
//                     tvFeatureOneRatings  = jsonTitle.getString("rating");
//                     tvFeatureTwoRatings = jsonTitle.getString("rating");
//                     tvFeatureThreeRatings = jsonTitle.getString("rating");
//                     tvFeatureFourRatings = jsonTitle.getString("rating");
//                }

//                for(i =0; i<jsonPros.length(); i++){
//                    JSONObject jsonProsText = jsonPros.getJSONObject(i);
//
//                     tvPros1 =jsonProsText.getString("pros") ;
//                     tvPros2 = jsonProsText.getString("pros");
//                    tvPros3 =jsonProsText.getString("pros") ;
//
//                }
//
//                for(i =0; i<jsonCons.length(); i++){
//                    JSONObject jsonConsText = jsonCons.getJSONObject(i);
//                   tvCons1 = jsonConsText.getString("cons");
//
//                }
                String tvReviews = jsonObject.getString("total_reviews_count");
                String ivProductImageCategoryPage =jsonObject.getString("large_image_snippet") ;


//                    DataModelThree dataModelThree = new DataModelThree(i+1,tvProductHeading,tvFeatureOne, tvFeatureTwo,tvFeatureThree,tvFeatureFour,tvPros1,tvPros2,tvPros3,tvCons1,tvReviews,tvFeatureOneRatings,tvFeatureTwoRatings,tvFeatureThreeRatings,tvFeatureFourRatings,ivProductImageCategoryPage);
//                    dataModelesThree.add(dataModelThree);

               DataModelThree dataModelThree = new DataModelThree(i+1,
                       tvProductHeading,
                       tvFeatureOne,tvFeatureTwo,tvFeatureThree,
                       tvFeatureFour,tvReviews,ivProductImageCategoryPage,
                       tvFeatureOneRating, tvFeatureTwoRatings,tvFeatureThreeRatings,tvFeatureFourRatings, overAllRating,
                       tvPros1,tvPros2,tvPros3,
                       tvCons1);
               dataModelesThree.add(dataModelThree);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
            return dataModelesThree;
    }
}
