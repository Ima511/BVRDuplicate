package com.example.bvrduplicate;


import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import java.util.ArrayList;

public class QueryUtilsRecOne {

    // Sample JSON for data loading on Home Screen

    private static final String SAMPLE_JSON_RESPONSE = "[\n" +
            "    {\n" +
            "        \"id\": 51,\n" +
            "        \"name\": \"Countertop microwave oven\",\n" +
            "        \"label\": \"Countertop Microwave Ovens\",\n" +
            "        \"region\": \"US\",\n" +
            "        \"description\": \"{'Predicted reliability': ['Panasonic Compact Microwave Oven with 1200 Watts of Cooking Power, Sensor Cooking, Popcorn Button, Quick 30sec and Turbo Defrost - NN-SN65KW - 1.2 cu. ft (White)', 'panasonic-compact-microwave-oven-with-1200-watts-of-cooking-power-sensor-cooking-popcorn-button-quick-30sec-and-turbo-defrost-nn-sn65kw-12-cu-ft-white'], 'Owner satisfaction': ['Farberware FMO11AHTBKB 1.1 Cu. Ft. Stainless Steel Countertop Microwave Oven With 6 Cooking Programs, LED Lighting, 1000 Watts', 'farberware-fmo11ahtbkb-11-cu-ft-stainless-steel-countertop-microwave-oven-with-6-cooking-programs-led-lighting-1000-watts'], 'Heating evenness': ['Nostalgia RMO4IVY Retro 0.9 Cubic Foot 800-Watt Countertop Microwave Oven, 5 Power Levels and 12 Cook Settings, LED Display, Ivory', 'nostalgia-rmo4ivy-retro-09-cubic-foot-800-watt-countertop-microwave-oven-5-power-levels-and-12-cook-settings-led-display-ivory'], 'Defrosting evenness': ['Panasonic Compact Microwave Oven with 1200 Watts of Cooking Power, Sensor Cooking, Popcorn Button, Quick 30sec and Turbo Defrost - NN-SN65KW - 1.2 cu. ft (White)', 'panasonic-compact-microwave-oven-with-1200-watts-of-cooking-power-sensor-cooking-popcorn-button-quick-30sec-and-turbo-defrost-nn-sn65kw-12-cu-ft-white'], 'Speed of heating': ['Panasonic Compact Microwave Oven with 1200 Watts of Cooking Power, Sensor Cooking, Popcorn Button, Quick 30sec and Turbo Defrost - NN-SN65KW - 1.2 cu. ft (White)', 'panasonic-compact-microwave-oven-with-1200-watts-of-cooking-power-sensor-cooking-popcorn-button-quick-30sec-and-turbo-defrost-nn-sn65kw-12-cu-ft-white'], 'Microwaving noise': ['Panasonic Compact Microwave Oven with 1200 Watts of Cooking Power, Sensor Cooking, Popcorn Button, Quick 30sec and Turbo Defrost - NN-SN65KW - 1.2 cu. ft (White)', 'panasonic-compact-microwave-oven-with-1200-watts-of-cooking-power-sensor-cooking-popcorn-button-quick-30sec-and-turbo-defrost-nn-sn65kw-12-cu-ft-white'], 'Ease of use': ['Sharp R-21LCFS Medium Duty Commercial Microwave (Dial Timer, 1000-Watts, 120-Volts) (Update of R-21LCF)', 'sharp-r-21lcfs-medium-duty-commercial-microwave-dial-timer-1000-watts-120-volts-update-of-r-21lcf'], 'Claimed capacity (cu. ft.)': ['Nostalgia RMO4IVY Retro 0.9 Cubic Foot 800-Watt Countertop Microwave Oven, 5 Power Levels and 12 Cook Settings, LED Display, Ivory', 'nostalgia-rmo4ivy-retro-09-cubic-foot-800-watt-countertop-microwave-oven-5-power-levels-and-12-cook-settings-led-display-ivory'], 'Usable capacity (cu. ft.)': ['Nostalgia RMO4IVY Retro 0.9 Cubic Foot 800-Watt Countertop Microwave Oven, 5 Power Levels and 12 Cook Settings, LED Display, Ivory', 'nostalgia-rmo4ivy-retro-09-cubic-foot-800-watt-countertop-microwave-oven-5-power-levels-and-12-cook-settings-led-display-ivory']}\",\n" +
            "        \"category_slug\": \"countertop-microwave-oven\",\n" +
            "        \"featured\": true,\n" +
            "        \"active\": true,\n" +
            "        \"created\": \"2020-02-05\",\n" +
            "        \"home_page_image\": \"countertop-microwave-oven/images/Countertop_Microwave_Oven_small.png\",\n" +
            "        \"category_page_image\": \"countertop-microwave-oven/images/countertop-microwave-oven_transparent-count_ygeZ8Ej.png\",\n" +
            "        \"cached_image\": \"thumbnails/countertop-microwave-oven.jpg\",\n" +
            "        \"total_reviews\": 168830,\n" +
            "        \"updated_at\": \"2022-08-24T07:20:56.230834Z\",\n" +
            "        \"featurewise_rank\": null,\n" +
            "        \"wp_cat_id\": 94,\n" +
            "        \"featured_order\": 1,\n" +
            "        \"name_chunks\": \"['Counter', 'oven', 'microwave']\",\n" +
            "        \"meta_desc\": \"Top 275 Countertop Microwave Ovens of 2022 priced between $4 - $99, rated based on Build Quality, Controls and Functionality, Customer Support, Design. Best rated Countertop Microwave Ovens Rank#1 Panasonic Microwave Oven NN-SN766S Stainless Steel Built-In with Inverter Technology and Genius Sensor, 1.6 Cubic Foot, 1250W\",\n" +
            "        \"meta_keywords\": \"Countertop Microwave Ovens, Best Countertop Microwave Ovens, Cheap Countertop Microwave Ovens, Best Countertop Microwave Ovens of year, Budget Countertop Microwave Ovens, Value Countertop Microwave Ovens, Premium Countertop Microwave Ovens, Toshiba Microwave, GE Countertop Microwave Ovens, Sharp Microwave Ovens, Kenmore Countertop Microwave Ovens, Samsung Microwave Ovens, Panasonic Microwaves, Frigidaire Microwaves, Microwave Drawers, KitchenAid Microwaves, Amazon Basics Microwaves, Oster Microwaves, Galanz Countertop Microwave Ovens, Retro Microwaves, 1000 Watt Microwaves, Commercial Microwaves, Farberware Countertop Microwave Ovens, 700 Watt Microwaves, Hot Selling Countertop Microwave Ovens, Amazon Countertop Microwave Ovens, BLACK+DECKER Countertop Microwave Ovens, COMFEE' Countertop Microwave Oven, Commercial Chef Countertop Microwave Oven, Daewoo Countertop Microwave Oven, Danby Countertop Microwave Oven, Emerson Radio Countertop Microwave Oven, Eocolz Countertop Microwave Oven, Sharp Microwave Drawer Oven Countertop Microwave Ovens, Panasonic Inverter Microwave Countertop Microwave Ovens, COSTWAY Countertop Microwave Ovens, GEN Countertop Microwave Ovens, Magic Chef Countertop Microwave Ovens, Mainstays Countertop Microwave Ovens, Nostalgia Countertop Microwave Ovens, RCA Countertop Microwave Ovens, Walsh Countertop Microwave Ovens, WINIA Countertop Microwave Ovens\",\n" +
            "        \"product_image_url\": \"https://m.media-amazon.com/images/I/411KxIEFjpL._SL500_.jpg\",\n" +
            "        \"related_category\": \"evaporative-coolers,rv-trailer-covers\",\n" +
            "        \"top_four_products\": \"[\\\"B085JSK3JP\\\", \\\"B07DJ43714\\\", \\\"B08N5VXS37\\\", \\\"B08K8WK2JR\\\", \\\"B07M6YYWJF\\\", \\\"B085T6RKF4\\\", \\\"B085565721\\\", \\\"B00BGTNY8O\\\", \\\"B01IB17RLE\\\", \\\"B07D46L6M6\\\"]\",\n" +
            "        \"small_product_image_url\": \"https://m.media-amazon.com/images/I/411KxIEFjpL._SL160_.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"id\": 62,\n" +
            "        \"name\": \"Steam mop\",\n" +
            "        \"label\": \"Steam Mops\",\n" +
            "        \"region\": \"US\",\n" +
            "        \"description\": \"{'Cleaning': [\\\"Steam Mop,LIGHT 'N' EASY Floor Steamers for Hardwood and Tile,Lightweight Steam Mops for Laminate Floor,Carpet Steamer,Wood Floor Mop Steam Cleaners,7618ANW\\\", 'steam-moplight-n-easy-floor-steamers-for-hardwood-and-tilelightweight-steam-mops-for-laminate-floorcarpet-steamerwood-floor-mop-steam-cleaners7618anw'], 'Steam rate': [\\\"Steam Mop,LIGHT 'N' EASY Floor Steamers for Hardwood and Tile,Lightweight Steam Mops for Laminate Floor,Carpet Steamer,Wood Floor Mop Steam Cleaners,7618ANW\\\", 'steam-moplight-n-easy-floor-steamers-for-hardwood-and-tilelightweight-steam-mops-for-laminate-floorcarpet-steamerwood-floor-mop-steam-cleaners7618anw'], 'Convenience': ['Bissell PowerFresh Slim Hard Wood Floor Steam Cleaner System, Steam Mop, Handheld Steamer and Scrubbing Tools, and Clothing Steamer Tool, 2075A', 'bissell-powerfresh-slim-hard-wood-floor-steam-cleaner-system-steam-mop-handheld-steamer-and-scrubbing-tools-and-clothing-steamer-tool-2075a'], 'Cord length (ft)': ['Shark Steam Mop Hard Floor Cleaner for Cleaning and Sanitizing with XL Removable Water Tank and 18-Foot Power Cord (S1000A)', 'shark-steam-mop-hard-floor-cleaner-for-cleaning-and-sanitizing-with-xl-removable-water-tank-and-18-foot-power-cord-s1000a']}\",\n" +
            "        \"category_slug\": \"steam-mop\",\n" +
            "        \"featured\": true,\n" +
            "        \"active\": true,\n" +
            "        \"created\": \"2020-02-05\",\n" +
            "        \"home_page_image\": \"steam-mops/images/Steam-Mops.png\",\n" +
            "        \"category_page_image\": \"steam-mop/images/steam-mop_transparent-steam-mop.png\",\n" +
            "        \"cached_image\": \"thumbnails/steam-mop.jpg\",\n" +
            "        \"total_reviews\": 69848,\n" +
            "        \"updated_at\": \"2022-08-25T08:08:52.884999Z\",\n" +
            "        \"featurewise_rank\": null,\n" +
            "        \"wp_cat_id\": 105,\n" +
            "        \"featured_order\": 2,\n" +
            "        \"name_chunks\": \"['Steam', 'mop']\",\n" +
            "        \"meta_desc\": \"Top 102 Steam Mops of 2022 priced between $2 - $87, rated based on Battery Life, Build Quality, Customer Support, Design. Best rated Steam Mops Rank#1 Steam Mop Cleaner 10-in-1 with Convenient Detachable Handheld Unit\",\n" +
            "        \"meta_keywords\": \"Steam Mops, Best Steam Mops, Cheap Steam Mops, Best Steam Mops of year, Budget Steam Mops, Value Steam Mops, Premium Steam Mops, Shark Steam Mops, Bissell Steam Mops, Hot Selling Steam Mops, VMAI Steam Mops, Turbo Microfiber Steam Mops, TOPPIN Steam Mops, Swiffer Steam Mops, SharkNinja Steam Mops, Secura Steam Mops, O-Cedar Steam Mops, Dirt Devil Steam Mops, Dupray Steam Mops, iwoly Steam Mops, LIGHT 'N' EASY Steam Mops, Smart Living Steam Mops, AIPER Steam Mops, Bulbhead Steam Mops, Hoover Steam Mops, OApier Steam Mops, Moolan Steam Mops, IMPRESA Steam Mops, PurSteam Steam Mops, AlfaBot Steam Mops, MXZONE Steam Mops\",\n" +
            "        \"product_image_url\": \"https://m.media-amazon.com/images/I/31iEygfdS2L._SL500_.jpg\",\n" +
            "        \"related_category\": \"girls-charm-bracelets,girls-bangles\",\n" +
            "        \"top_four_products\": \"[\\\"B077S6KQ88\\\", \\\"B088T71WDR\\\", \\\"B08NFFR587\\\", \\\"B07CZD7R34\\\", \\\"B07S8VBHXT\\\", \\\"B07C44DM6D\\\", \\\"B07MW32ZPR\\\", \\\"B09F5G655J\\\", \\\"B06X9F3KWS\\\", \\\"B06WP2CLYY\\\"]\",\n" +
            "        \"small_product_image_url\": \"https://m.media-amazon.com/images/I/31iEygfdS2L._SL160_.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"id\": 1794,\n" +
            "        \"name\": \"Stand-Up Paddleboards\",\n" +
            "        \"label\": \"Stand-Up Paddleboards\",\n" +
            "        \"region\": \"US\",\n" +
            "        \"description\": null,\n" +
            "        \"category_slug\": \"stand-up-paddleboards\",\n" +
            "        \"featured\": true,\n" +
            "        \"active\": true,\n" +
            "        \"created\": \"2021-02-08\",\n" +
            "        \"home_page_image\": \"stand-up-paddleboards/images/stand-up-paddleboards.png\",\n" +
            "        \"category_page_image\": \"stand-up-paddleboards/images/stand-up-paddleboards.png\",\n" +
            "        \"cached_image\": \"\",\n" +
            "        \"total_reviews\": 137192,\n" +
            "        \"updated_at\": \"2022-08-24T12:36:02.261973Z\",\n" +
            "        \"featurewise_rank\": null,\n" +
            "        \"wp_cat_id\": null,\n" +
            "        \"featured_order\": 3,\n" +
            "        \"name_chunks\": \"['Stand', 'boards', 'Paddle']\",\n" +
            "        \"meta_desc\": \"Top 286 Stand-Up Paddleboards of 2022 priced between $25 - $546, rated based on Convenience, Easy to Inflate, Overall Satisfaction, Portability. Best rated Stand-Up Paddleboards Rank#1 Roc Inflatable Stand Up Paddle Board\",\n" +
            "        \"meta_keywords\": \"Stand-Up Paddleboards, Best Stand-Up Paddleboards, Cheap Stand-Up Paddleboards, Best Stand-Up Paddleboards of year, Budget Stand-Up Paddleboards, Value Stand-Up Paddleboards, Premium Stand-Up Paddleboards, Hot Selling Stand-Up Paddleboards, ISLE Stand-Up Paddleboards, BOTE Stand-Up Paddleboards, AKSPORT Stand-Up Paddleboards, Aqua Plus Stand-Up Paddleboards, awesafe Stand-Up Paddleboards, Bestway Stand-Up Paddleboards, Bluefin SUP Stand-Up Paddleboards, DAMA Stand-Up Paddleboards, DRIFT Stand-Up Paddleboards, FBSPORT Stand-Up Paddleboards, FEATH-R-LITE Stand-Up Paddleboards, Freein Stand-Up Paddleboards, FunWater Stand-Up Paddleboards, Goplus Stand-Up Paddleboards, iROCKER Stand-Up Paddleboards, MURTISOL Stand-Up Paddleboards, PEAK Paddle Boards Stand-Up Paddleboards, Pelican Stand-Up Paddleboards, Roc Stand-Up Paddleboards, Rumlad Stand-Up Paddleboards, Run Wave Stand-Up Paddleboards, SereneLife Stand-Up Paddleboards, Tower Paddle Boards Stand-Up Paddleboards, Vilano Stand-Up Paddleboards, XYLOVE CO Stand-Up Paddleboards, YASKA Stand-Up Paddleboards, Zupapa Stand-Up Paddleboards, ACOWAY Stand-Up Paddleboards, ADVENOR Stand-Up Paddleboards, AIRHEAD Stand-Up Paddleboards, Aquaplanet Stand-Up Paddleboards, Atoll Stand-Up Paddleboards, BEST Marine and Outdoors Stand-Up Paddleboards, Cooyes Stand-Up Paddleboards, Famistar Stand-Up Paddleboards, FAYEAN Stand-Up Paddleboards, Goosehill Stand-Up Paddleboards, Highpi Stand-Up Paddleboards, Jasonwell Stand-Up Paddleboards, Mousa Stand-Up Paddleboards, Pathfinder Stand-Up Paddleboards, TUSY Stand-Up Paddleboards, SUP Supply Stand-Up Paddleboards\",\n" +
            "        \"product_image_url\": \"https://m.media-amazon.com/images/I/51FmQsR7zBL._SL500_.jpg\",\n" +
            "        \"related_category\": \"\",\n" +
            "        \"top_four_products\": \"[\\\"B07ZJWGSFG\\\", \\\"B07RTC39B5\\\", \\\"B07MZC33BR\\\", \\\"B08R38GCNH\\\", \\\"B08K3D2TZ1\\\", \\\"B085PY4789\\\", \\\"B08YFKFH46\\\", \\\"B084BQSL2Z\\\", \\\"B08T61JSYW\\\", \\\"B08SLP6TSX\\\"]\",\n" +
            "        \"small_product_image_url\": \"https://m.media-amazon.com/images/I/51TodqNGmrL._SL160_.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"id\": 43,\n" +
            "        \"name\": \"Portable Air Conditioners\",\n" +
            "        \"label\": \"Portable Air Conditioners\",\n" +
            "        \"region\": \"US\",\n" +
            "        \"description\": \"{'Predicted reliability': ['Honeywell 14000 Btu Portable Air Conditioner, Dehumidifier & Fan for Rooms Up to 550-700 Sq. Ft with Remote Control, HL14CESWK, White & Black', 'honeywell-14000-btu-portable-air-conditioner-dehumidifier-fan-for-rooms-up-to-550-700-sq-ft-with-remote-control-hl14ceswk-white-black'], 'Owner satisfaction': ['LEVOIT Air Purifier for Home Large Room with True HEPA Filter,Air Cleaner for Allergies and Pets Hair,Smokers,Mold,Pollen,Dust,Quiet Odor Eliminators for Bedroom,Smart Auto Mode & Timer,LV-PUR131', 'levoit-air-purifier-for-home-large-room-with-true-hepa-filterair-cleaner-for-allergies-and-pets-hairsmokersmoldpollendustquiet-odor-eliminators-for-bedroomsmart-auto-mode-timerlv-pur131'], 'Comfort': ['Whynter ARC-14SH 14,000 BTU Dual Hose Portable Air Conditioner and Heater, Dehumidifier, Fan with Activated Carbon Filter plus Storage bag for Rooms up to 500 sq ft', 'whynter-arc-14sh-14000-btu-dual-hose-portable-air-conditioner-and-heater-dehumidifier-fan-with-activated-carbon-filter-plus-storage-bag-for-rooms-up-to-500-sq-ft'], 'Brownout': ['LEVOIT Air Purifier for Home Large Room with True HEPA Filter,Air Cleaner for Allergies and Pets Hair,Smokers,Mold,Pollen,Dust,Quiet Odor Eliminators for Bedroom,Smart Auto Mode & Timer,LV-PUR131', 'levoit-air-purifier-for-home-large-room-with-true-hepa-filterair-cleaner-for-allergies-and-pets-hairsmokersmoldpollendustquiet-odor-eliminators-for-bedroomsmart-auto-mode-timerlv-pur131'], 'Indoor noise high': ['LG LP0818WNR Portable, White 115V Air Conditioner, Rooms up to 200-Sq. Ft,', 'lg-lp0818wnr-portable-white-115v-air-conditioner-rooms-up-to-200-sq-ft'], 'Indoor noise low': ['LG LP0818WNR Portable, White 115V Air Conditioner, Rooms up to 200-Sq. Ft,', 'lg-lp0818wnr-portable-white-115v-air-conditioner-rooms-up-to-200-sq-ft']}\",\n" +
            "        \"category_slug\": \"portable-air-conditioners\",\n" +
            "        \"featured\": true,\n" +
            "        \"active\": true,\n" +
            "        \"created\": \"2020-01-30\",\n" +
            "        \"home_page_image\": \"portable-air-conditioners/images/portable-air-conditioners.png\",\n" +
            "        \"category_page_image\": \"portable-air-conditioners/images/portable-air-conditioners_transparent-porta_83uL4Ze.png\",\n" +
            "        \"cached_image\": \"thumbnails/portable-air-conditioners.jpg\",\n" +
            "        \"total_reviews\": 112980,\n" +
            "        \"updated_at\": \"2022-08-24T10:52:30.812958Z\",\n" +
            "        \"featurewise_rank\": null,\n" +
            "        \"wp_cat_id\": 86,\n" +
            "        \"featured_order\": 4,\n" +
            "        \"name_chunks\": \"['Air', 'Conditioners', 'Portable']\",\n" +
            "        \"meta_desc\": \"Top 287 Portable Air Conditioners of 2022 priced between $4 - $99, rated based on Build Quality, Controls and Functionality, Convenience, Customer Support. Best rated Portable Air Conditioners Rank#1 Black + Decker BPACT10WT Portable Air Conditioner, 10,000 BTU\",\n" +
            "        \"meta_keywords\": \"Portable Air Conditioners, Best Portable Air Conditioners, Cheap Portable Air Conditioners, Best Portable Air Conditioners of year, Budget Portable Air Conditioners, Value Portable Air Conditioners, Premium Portable Air Conditioners, LG Portable Air Conditioners, Hot Selling Portable Air Conditioners, De'Longhi Portable Air Conditioners, Honeywell Portable Air Conditioners, Frigidaire Portable Air Conditioners, Whynter Portable Air Conditioners, Portable Mini Air Conditioner Portable Air Conditioners, 12000 BTU Portable Air Conditioners, Edgestar Portable Air Conditioners, AddAcc Portable Air Conditioners, ADDSMILE Portable Air Conditioners, Air Choice Portable Air Conditioners, AireMax Portable Air Conditioners, Airo Comfort Portable Air Conditioners, AIVANT Portable Air Conditioners, Amazon Basics Portable Air Conditioners, Anbber Portable Air Conditioners, Batlofty Portable Air Conditioners, Beaulyn Portable Air Conditioners, Best Choice Products Portable Air Conditioners, BLACK+DECKER Portable Air Conditioners, breezewell Portable Air Conditioners, Briza Portable Air Conditioners, BRIZER Portable Air Conditioners, CCH Portable Air Conditioners, C-color Portable Air Conditioners, Charmelife Portable Air Conditioners, ComfyHome Portable Air Conditioners, COMLIFE Portable Air Conditioners, COSTWAY Portable Air Conditioners, Della Portable Air Conditioners, Diowner Portable Air Conditioners, Duomishu Portable Air Conditioners, E EUHOMY Portable Air Conditioners, EEIEER Portable Air Conditioners, ELETOL Portable Air Conditioners, Evapolar Portable Air Conditioners, Fitfirst Portable Air Conditioners, focondot Portable Air Conditioners, GLOBAL AIR Portable Air Conditioners, GtTech Portable Air Conditioners, HAYI Portable Air Conditioners, hOmeLabs Portable Air Conditioners, IMIKEYA Portable Air Conditioners, JHS Portable Air Conditioners, KUUOTE Portable Air Conditioners, LaoTzi Portable Air Conditioners, Lemebo Portable Air Conditioners, Liucheng Portable Air Conditioners, MAXROCK Portable Air Conditioners, Mekomy Portable Air Conditioners, MELOPHY Portable Air Conditioners, Midea Portable Air Conditioners, Mikikin Portable Air Conditioners, MOVTIP Portable Air Conditioners, NewAir Portable Air Conditioners, NEXGADGET Portable Air Conditioners, NTMY Portable Air Conditioners, Ontel Portable Air Conditioners, OVPPH Portable Air Conditioners, OYRGCIK Portable Air Conditioners, PCCOOLER Portable Air Conditioners, Pelonis Portable Air Conditioners, Qosea Portable Air Conditioners, QVCQ Portable Air Conditioners, Rollibot Portable Air Conditioners, Rosewill Portable Air Conditioners, SereneLife Portable Air Conditioners, SHAALEK Portable Air Conditioners, Shinco Portable Air Conditioners, SmartDevil Portable Air Conditioners, Spmmmner Portable Air Conditioners, Swonuk Portable Air Conditioners, Tongmao Portable Air Conditioners, TECCPO Portable Air Conditioners, Tripp Lite Portable Air Conditioners, TOSOT Portable Air Conditioners, Vivibyan Portable Air Conditioners, Vremi Portable Air Conditioners, ZEEF Portable Air Conditioners, Auka Portable Air Conditioners\",\n" +
            "        \"product_image_url\": \"https://m.media-amazon.com/images/I/513kQK6QuIS._SL500_.jpg\",\n" +
            "        \"related_category\": \"handheld-steamers,briefcases,weather-stripping,mop-refill-sponges,portable-air-conditioners,automotive-vinyl-wraps\",\n" +
            "        \"top_four_products\": \"[\\\"B07SY8R65G\\\", \\\"B09M3QRC2S\\\", \\\"B09BNBSHVF\\\", \\\"B09123LSZR\\\", \\\"B08QHPTNH4\\\", \\\"B0992BYDLJ\\\", \\\"B07SFJXLYW\\\", \\\"B08XTZ9WS7\\\", \\\"B086ZPGB6F\\\", \\\"B097B2Y97X\\\"]\",\n" +
            "        \"small_product_image_url\": \"https://m.media-amazon.com/images/I/513kQK6QuIS._SL160_.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"id\": 1520,\n" +
            "        \"name\": \"Inkjet Printers\",\n" +
            "        \"label\": \"Inkjet Printers\",\n" +
            "        \"region\": \"US\",\n" +
            "        \"description\": null,\n" +
            "        \"category_slug\": \"inkjet-printers\",\n" +
            "        \"featured\": true,\n" +
            "        \"active\": true,\n" +
            "        \"created\": \"2020-09-14\",\n" +
            "        \"home_page_image\": \"inkjet-printers/images/inkjet-printers.png\",\n" +
            "        \"category_page_image\": \"\",\n" +
            "        \"cached_image\": \"thumbnails/inkjet-printers.jpg\",\n" +
            "        \"total_reviews\": 244282,\n" +
            "        \"updated_at\": \"2022-08-24T09:36:51.576027Z\",\n" +
            "        \"featurewise_rank\": null,\n" +
            "        \"wp_cat_id\": null,\n" +
            "        \"featured_order\": 5,\n" +
            "        \"name_chunks\": \"['Inkjet', 'Printers']\",\n" +
            "        \"meta_desc\": \"Top 269 Inkjet Printers of 2022 priced between $9 - $113, rated based on Build Quality, Compatibility, Controls and Functionality, Customer Support. Best rated Inkjet Printers Rank#1 Canon G3260 All-in-One Printer\",\n" +
            "        \"meta_keywords\": \"Inkjet Printers, Best Inkjet Printers, Cheap Inkjet Printers, Best Inkjet Printers of year, Budget Inkjet Printers, Value Inkjet Printers, Premium Inkjet Printers, HP Inkjet Printers, Epson Inkjet Printers, Canon Inkjet Printers, Brother Inkjet Printers, Hot Selling Inkjet Printers, Portable Inkjet Printers, HP Envy Inkjet Printers, Lexmark Inkjet Printers, NEEGO Inkjet Printers\",\n" +
            "        \"product_image_url\": \"https://m.media-amazon.com/images/I/41vJ4ivFvrL._SL500_.jpg\",\n" +
            "        \"related_category\": \"laser-printer-drums-toner,inkjet-printers,desktop-label-printers,glue,check-writers,cereal-containers,stationery,clipboards,copy-multipurpose-paper,laptop-screen-protectors,dye-sublimation-paper,telephone-headsets,office-staples,classroom-pocket-charts,loose-leaf-binder-paper,tablet,printing-calculators,binder-pouches,shredders,cordless-telephone-batteries,lap-desks,inkjet-printer-paper,mens-t-shirts,headphone-amps,view-binders,document-scanners,computer-motherboards,computer-cables-interconnects,laptop-hard-shell-cases,3d-viewing-glasses,internal-networking-cards,laptop-batteries\",\n" +
            "        \"top_four_products\": \"[\\\"B0091UBCB6\\\", \\\"B085VMW9YD\\\", \\\"B00LEA5EHO\\\", \\\"B00NEIOYO8\\\", \\\"B084ZR9MJB\\\", \\\"B082VY2RMY\\\", \\\"B08PCCXXJ2\\\", \\\"B08XYRVSRT\\\", \\\"B0855QTLRY\\\", \\\"B081QLL2P9\\\"]\",\n" +
            "        \"small_product_image_url\": \"https://m.media-amazon.com/images/I/41vJ4ivFvrL._SL160_.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"id\": 1933,\n" +
            "        \"name\": \"Monitors\",\n" +
            "        \"label\": \"Computer Monitors\",\n" +
            "        \"region\": \"US\",\n" +
            "        \"description\": null,\n" +
            "        \"category_slug\": \"computer-monitors\",\n" +
            "        \"featured\": true,\n" +
            "        \"active\": true,\n" +
            "        \"created\": \"2021-03-04\",\n" +
            "        \"home_page_image\": \"computer-monitors/images/computer-monitors.png\",\n" +
            "        \"category_page_image\": \"\",\n" +
            "        \"cached_image\": \"\",\n" +
            "        \"total_reviews\": 340713,\n" +
            "        \"updated_at\": \"2022-08-29T07:02:42.141466Z\",\n" +
            "        \"featurewise_rank\": null,\n" +
            "        \"wp_cat_id\": null,\n" +
            "        \"featured_order\": 6,\n" +
            "        \"name_chunks\": \"\",\n" +
            "        \"meta_desc\": \"Top 637 Computer Monitors of 2022 priced between $124 - $463, rated based on Build Quality, Customer Support, Display, Overall Performance. Best rated Computer Monitors Rank#1 SAMSUNG 24-Inch CRG5 144Hz Curved Gaming Monitor (LC24RG50FQNXZA) â€“ Computer Monitor\",\n" +
            "        \"meta_keywords\": \"Computer Monitors, Best Computer Monitors, Cheap Computer Monitors, Best Computer Monitors of year, Budget Computer Monitors, Value Computer Monitors, Premium Computer Monitors, Curved Computer Monitors, Portable Computer Monitors, 32 inch Computer Monitors, Dell Computer Monitors, HP Computer Monitors, 27 inch Computer Monitors, HDMI Computer Monitors, 24 inch Computer Monitors, Acer Computer Monitors, Touch Screen Computer Monitors, Gaming Computer Monitors, AOC Computer Monitors, Samsung Computer Monitors, Asus Computer Monitors, 30 inch Computer Monitors, LG Computer Monitors, Sceptre Computer Monitors, Philips Computer Monitors, ViewSonic Computer Monitors, Lenovo Computer Monitors, BenQ Computer Monitors, Lepow Computer Monitors, Viotek Computer Monitors, Trio Computer Monitors, KYY Computer Monitors, MSI Computer Monitors, AOPEN Computer Monitors, SideTrak Computer Monitors, Hot Selling Computer Monitors, Alienware Computer Monitors, Eyoyo Computer Monitors, GTEK Computer Monitors, Lasitu Computer Monitors, Prechen Computer Monitors\",\n" +
            "        \"product_image_url\": \"https://m.media-amazon.com/images/I/41i5i7zUDPL._SL500_.jpg\",\n" +
            "        \"related_category\": null,\n" +
            "        \"top_four_products\": \"[\\\"B07ZLY26FW\\\", \\\"B08T76SY2J\\\", \\\"B088D8JG3L\\\", \\\"B07V1SQ966\\\", \\\"B088TLQR3K\\\", \\\"B07TWGBG3P\\\", \\\"B091GFZNJ5\\\", \\\"B07RGPCQG1\\\", \\\"B08JCGJNQ8\\\", \\\"B07CVL2D2S\\\"]\",\n" +
            "        \"small_product_image_url\": \"https://m.media-amazon.com/images/I/41i5i7zUDPL._SL160_.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"id\": 67,\n" +
            "        \"name\": \"Exercise bike\",\n" +
            "        \"label\": \"Exercise Bikes\",\n" +
            "        \"region\": \"US\",\n" +
            "        \"description\": \"{'Ergonomics': ['Cyclace Exercise Bike Stationary 330 Lbs Weight Capacity- Indoor Cycling Bike with Tablet Holder and LCD Monitor for Home Workout', 'cyclace-exercise-bike-stationary-330-lbs-weight-capacity-indoor-cycling-bike-with-tablet-holder-and-lcd-monitor-for-home-workout'], 'Exercise range': ['Cyclace Exercise Bike Stationary 330 Lbs Weight Capacity- Indoor Cycling Bike with Tablet Holder and LCD Monitor for Home Workout', 'cyclace-exercise-bike-stationary-330-lbs-weight-capacity-indoor-cycling-bike-with-tablet-holder-and-lcd-monitor-for-home-workout'], 'Ease of use': ['BulbHead As Seen On TV Slim Cycle 2-in-1 Stationary Bike - Folding Indoor Exercise Bike with Arm Resistance Bands and Heart Monitor - Perfect Home Exercise Machine for Cardio', 'bulbhead-as-seen-on-tv-slim-cycle-2-in-1-stationary-bike-folding-indoor-exercise-bike-with-arm-resistance-bands-and-heart-monitor-perfect-home-exercise-machine-for-cardio'], 'Construction': ['Vanswe Recumbent Exercise Bike 16 Levels Magnetic Tension Resistance 380 lbs. Stationary Bike with Adjustable Seat, Transport Wheels and Bluetooth Connectivity for Workout and Physical Therapy', 'vanswe-recumbent-exercise-bike-16-levels-magnetic-tension-resistance-380-lbs-stationary-bike-with-adjustable-seat-transport-wheels-and-bluetooth-connectivity-for-workout-and-physical-therapy'], 'User safety': ['Nautilus Recumbent Bike', 'nautilus-recumbent-bike'], 'Type': ['DeskCycle Under Desk Cycle,Pedal Exerciser - Stationary Mini Exercise Bike - Office, Home Equipment', 'deskcycle-under-desk-cyclepedal-exerciser-stationary-mini-exercise-bike-office-home-equipment']}\",\n" +
            "        \"category_slug\": \"exercise-bike\",\n" +
            "        \"featured\": true,\n" +
            "        \"active\": true,\n" +
            "        \"created\": \"2020-02-05\",\n" +
            "        \"home_page_image\": \"exercise-bike/images/Exercise_Bike_small.png\",\n" +
            "        \"category_page_image\": \"exercise-bike/images/exercise-bike_transparent-exercise-bike.png\",\n" +
            "        \"cached_image\": \"thumbnails/exercise-bike.jpg\",\n" +
            "        \"total_reviews\": 175071,\n" +
            "        \"updated_at\": \"2022-09-02T05:53:30.220003Z\",\n" +
            "        \"featurewise_rank\": null,\n" +
            "        \"wp_cat_id\": 110,\n" +
            "        \"featured_order\": 7,\n" +
            "        \"name_chunks\": \"['Exercise', 'bike']\",\n" +
            "        \"meta_desc\": \"Top 307 Exercise Bikes of 2022 priced between $8 - $99, rated based on Build Quality, Convenience, Customer Support, Design. Best rated Exercise Bikes Rank#1 Sunny Health & Fitness Indoor Cycling Exercise Stationary Bike\",\n" +
            "        \"meta_keywords\": \"Exercise Bikes, Best Exercise Bikes, Cheap Exercise Bikes, Best Exercise Bikes of year, Budget Exercise Bikes, Value Exercise Bikes, Premium Exercise Bikes, Recumbent Exercise Bikes, Proform Exercise Bikes, Hot Selling Exercise Bikes, 3G Cardio Exercise bike, ADVENOR Exercise bike, Ativafit Exercise bike, BalanceFrom Exercise bike, BARWING Exercise bike, BCAN Exercise bike, Body Power Exercise bike, Body Rider Exercise bike, BulbHead Exercise bike, Circuit Fitness Exercise bike, Cyclace Exercise bike, cycool Exercise bike, DeskCycle Exercise bike, Doufit Exercise bike, Drive Medical Exercise bike, Exerpeutic Exercise bike, HARISON Exercise bike, JEEKEE Exercise bike, JOROTO Exercise bike, L NOW Exercise bike, LANOS Exercise bike, leikefitness Exercise bike, Marcy Exercise bike, Merax Exercise bike, MURTISOL Exercise bike, Nautilus Exercise bike, NordicTrack Exercise bike, PLENY Exercise bike, pooboo Exercise bike, ProGear Exercise bike, PYHIGH Exercise bike, Schwinn Fitness Exercise bike, SNODE Exercise bike, Sovnia Exercise bike, Stamina Exercise bike, SunFitter Exercise bike, Sunny Health & Fitness Exercise bike, Teeter Exercise bike, UREVO Exercise bike, VANSWE Exercise bike, VIGBODY Exercise bike, Wakeman Exercise bike, OVICX Exercise bike, XTERRA Fitness Exercise bike, YOSUDA Exercise bike, CRUSSAC Exercise bike, DMASUN Exercise bike, Echelon Exercise bike, himaly Exercise bike, Jobur Exercise bike, TODO Exercise bike\",\n" +
            "        \"product_image_url\": \"https://m.media-amazon.com/images/I/51+JbAlyzfL._SL500_.jpg\",\n" +
            "        \"related_category\": \"boys-water-shoes,mens-activewear-t-shirts,strength-training-kettlebells\",\n" +
            "        \"top_four_products\": \"[\\\"B07Q6X4H9N\\\", \\\"B07HQP3DJ8\\\", \\\"B00B1VDNQA\\\", \\\"B07X6GHLLT\\\", \\\"B0872255PS\\\", \\\"B0765ZM52J\\\", \\\"B08LCKX1CC\\\", \\\"B07X6GL6TC\\\", \\\"B08GYRYGYX\\\", \\\"B002KV1MJU\\\"]\",\n" +
            "        \"small_product_image_url\": \"https://m.media-amazon.com/images/I/51+JbAlyzfL._SL160_.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"id\": 88,\n" +
            "        \"name\": \"Laptop\",\n" +
            "        \"label\": \"Laptops\",\n" +
            "        \"region\": \"US\",\n" +
            "        \"description\": \"{'Predicted reliability': ['Acer Predator Triton 500 Thin & Light Gaming Laptop, Intel Core i7-9750H, GeForce RTX 2060 with 6GB, 15.6\\\" Full HD 144Hz 3ms IPS Display, 16GB DDR4, 512GB PCIe NVMe SSD, RGB Keyboard, PT515-51-75BH', 'acer-predator-triton-500-thin-light-gaming-laptop-intel-core-i7-9750h-geforce-rtx-2060-with-6gb-156-full-hd-144hz-3ms-ips-display-16gb-ddr4-512gb-pcie-nvme-ssd-rgb-keyboard-pt515-51-75bh'], 'Owner satisfaction': ['2018 Flagship Dell Inspiron 11.6\\\" HD Chromebook, Intel Dual-Core Celeron N3060 up to 2.48GHz, 4GB RAM 16GB SSD HDMI USB Bluetooth 802.11ac HD Webcam Chrome OS', '2018-flagship-dell-inspiron-116-hd-chromebook-intel-dual-core-celeron-n3060-up-to-248ghz-4gb-ram-16gb-ssd-hdmi-usb-bluetooth-80211ac-hd-webcam-chrome-os'], 'Ergonomics': ['Acer Swift 3 SF314-55G-78U1 Laptop, 8th Gen Intel Core i7-8565U, NVIDIA GeForce MX150, 14\\\" Full HD, 8GB DDR4, 256GB PCIe SSD, Gigabit WiFi, Back-lit Keyboard, Windows 10', 'acer-swift-3-sf314-55g-78u1-laptop-8th-gen-intel-core-i7-8565u-nvidia-geforce-mx150-14-full-hd-8gb-ddr4-256gb-pcie-ssd-gigabit-wifi-back-lit-keyboard-windows-10'], 'Portability': ['Dell Latitude 5490 XXPKH Laptop (Windows 10 Pro, Intel i5-8250U, 14\\\" LCD Screen, Storage: 256 GB, RAM: 8 GB) Black', 'dell-latitude-5490-xxpkh-laptop-windows-10-pro-intel-i5-8250u-14-lcd-screen-storage-256-gb-ram-8-gb-black'], 'Performance': ['Lenovo Legion 15.6\\\" FHD LED Backlit Gaming Laptop w/RGB Gaming Mouse | Intel Core i7-9750H Hexa-Core | 16GB DDR4 RAM | 512GB SSD+1TB HDD | NVIDIA GeForce GTX 1650 | White Backlit Keyboard | Windows 10', 'lenovo-legion-156-fhd-led-backlit-gaming-laptop-wrgb-gaming-mouse-intel-core-i7-9750h-hexa-core-16gb-ddr4-ram-512gb-ssd1tb-hdd-nvidia-geforce-gtx-1650-white-backlit-keyboard-windows-10'], 'Versatility': ['Acer Swift 3 SF315 Laptop: Core i7-8550U, 256GB SSD, 8GB RAM, 15.6\\\" Full HD IPS Display, Windows 10 (Luxury Gold)', 'acer-swift-3-sf315-laptop-core-i7-8550u-256gb-ssd-8gb-ram-156-full-hd-ips-display-windows-10-luxury-gold'], 'Display': ['Acer Aspire 5 Slim Laptop, 15.6\\\" Full HD IPS Display, 8th Gen Intel Core i7-8565U, NVIDIA GeForce MX250, 12GB DDR4, 512GB PCIe Nvme SSD, Windows 10 Home, A515-54G-73WC', 'acer-aspire-5-slim-laptop-156-full-hd-ips-display-8th-gen-intel-core-i7-8565u-nvidia-geforce-mx250-12gb-ddr4-512gb-pcie-nvme-ssd-windows-10-home-a515-54g-73wc'], 'Battery Life - web (hr.)': ['Lenovo Flex 14 2-in-1 Convertible Laptop, 14 Inch FHD Touchscreen Display, AMD Ryzen 5 3500U Processor, 12GB DDR4 RAM, 256GB NVMe SSD, Windows 10, 81SS000DUS, Black, Pen Included', 'lenovo-flex-14-2-in-1-convertible-laptop-14-inch-fhd-touchscreen-display-amd-ryzen-5-3500u-processor-12gb-ddr4-ram-256gb-nvme-ssd-windows-10-81ss000dus-black-pen-included'], 'Battery Life - video (hr.)': ['NEW Microsoft Surface Pro 7 – 12.3\\\" Touch-Screen - 10th Gen Intel Core i5 - 8GB Memory - 256GB SSD (Latest Model) – Matte Black with Black Type Cover', 'new-microsoft-surface-pro-7-123-touch-screen-10th-gen-intel-core-i5-8gb-memory-256gb-ssd-latest-model-matte-black-with-black-type-cover'], 'Weight (lbs.)': ['MSI GS75 Stealth-413 17.3\\\" Gaming Laptop, 144Hz Display, Thin Bezel, Intel Core i7-9750H, NVIDIA GeForce GTX1660Ti, 16GB, 1TB NVMe NVMe SSD, Thunderbolt 3', 'msi-gs75-stealth-413-173-gaming-laptop-144hz-display-thin-bezel-intel-core-i7-9750h-nvidia-geforce-gtx1660ti-16gb-1tb-nvme-nvme-ssd-thunderbolt-3']}\",\n" +
            "        \"category_slug\": \"laptop\",\n" +
            "        \"featured\": true,\n" +
            "        \"active\": true,\n" +
            "        \"created\": \"2020-02-09\",\n" +
            "        \"home_page_image\": \"laptop/images/laptop_transparent-laptop_small.png\",\n" +
            "        \"category_page_image\": \"laptop/images/laptop_transparent-laptop.png\",\n" +
            "        \"cached_image\": \"thumbnails/laptop.jpg\",\n" +
            "        \"total_reviews\": 154643,\n" +
            "        \"updated_at\": \"2022-08-24T06:16:44.794670Z\",\n" +
            "        \"featurewise_rank\": null,\n" +
            "        \"wp_cat_id\": 131,\n" +
            "        \"featured_order\": 8,\n" +
            "        \"name_chunks\": \"['Laptop']\",\n" +
            "        \"meta_desc\": \"Top 879 Laptops of 2022 priced between $275 - $1739, rated based on Apps and Gaming Support, Battery Life, Build Quality, Controls and Functionality. Best rated Laptops Rank#1 New Apple MacBook Pro with Apple M1 Chip - Silver (Latest Model)\",\n" +
            "        \"meta_keywords\": \"Laptops, Best Laptops, Cheap Laptops, Best Laptops of year, Lenovo Laptops, Dell Laptops, Acer Laptops, Asus Laptops, HP Laptops, MSI Laptops, Budget Laptops, Value Laptops, Premium Laptops, Gaming Laptops, Windows laptops, 16GB RAM Laptops, 4k Laptops, Intel Core i3 Processor laptops, 144hz Screen Laptops, AMD Ryzen Processors Laptops, Intel Core i9 Processor laptops, AMD Ryzen 3 Processor Laptops, 64GB RAM Laptops, 8GB RAM Laptops, Sager Laptops, NVIDIA GeForce RTX 2060 Laptops, NVIDIA GeForce RTX 2070 Laptops, AMD Ryzen 5 Processor Laptops, AMD Ryzen 7 Processor Laptops, 32GB RAM Laptops, Intel Core i7 Processor laptops, 15.6 Inch Screen Laptops, Intel Core i5 Processor laptops, Waterproof Laptops, AMD Ryzen 9 Processors Laptops, NVIDIA GeForce RTX 3060 Laptops, Hot Selling Laptops, Amazon Renewed Laptop, Apple Laptop, Gigabyte Laptop, HUAWEI Laptop, jumper Laptop, LG Laptop, llltrade Laptop, NexiGo Laptop, Razer Laptop, Samsung Electronics Laptop, Tanoshi Laptop, VUCATIMES Laptop, XIDU Laptop\",\n" +
            "        \"product_image_url\": \"https://m.media-amazon.com/images/I/41IxNpjdJAL._SL500_.jpg\",\n" +
            "        \"related_category\": \"office-staples,computer-graphics-tablets,laptop-briefcases,tablet-cases,styluses,backpacks,cordless-telephone-batteries,telephone-audio-conferencing-products,laptop-sleeves,digital-coaxial-cables,laptop-screen-filters,laptop-batteries\",\n" +
            "        \"top_four_products\": \"[\\\"B085B3GFRL\\\", \\\"B08XKF9VBX\\\", \\\"B08N5M9XBS\\\", \\\"B08842D7JS\\\", \\\"B0863Z4SLS\\\", \\\"B087Z44RCM\\\", \\\"B08BB9RWXD\\\", \\\"B08WJ69CZL\\\", \\\"B0821ZJBF8\\\", \\\"B08FBSLS7V\\\"]\",\n" +
            "        \"small_product_image_url\": \"https://m.media-amazon.com/images/I/41IxNpjdJAL._SL160_.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"id\": 1548,\n" +
            "        \"name\": \"Video Projectors\",\n" +
            "        \"label\": \"Video Projectors\",\n" +
            "        \"region\": \"US\",\n" +
            "        \"description\": null,\n" +
            "        \"category_slug\": \"video-projectors\",\n" +
            "        \"featured\": true,\n" +
            "        \"active\": true,\n" +
            "        \"created\": \"2020-09-14\",\n" +
            "        \"home_page_image\": \"video-projector/images/video-projector.png\",\n" +
            "        \"category_page_image\": \"\",\n" +
            "        \"cached_image\": \"thumbnails/video-projectors.jpg\",\n" +
            "        \"total_reviews\": 121833,\n" +
            "        \"updated_at\": \"2022-08-29T02:48:31.129459Z\",\n" +
            "        \"featurewise_rank\": null,\n" +
            "        \"wp_cat_id\": null,\n" +
            "        \"featured_order\": 9,\n" +
            "        \"name_chunks\": \"['Video', 'Projectors']\",\n" +
            "        \"meta_desc\": \"Top 335 Video Projectors of 2022 priced between $6 - $127, rated based on Audio Quality, Build Quality, Customer Support, Design. Best rated Video Projectors Rank#1 High Brightness Projector for Home and Office\",\n" +
            "        \"meta_keywords\": \"Video Projectors, Best Video Projectors, Cheap Video Projectors, Best Video Projectors of year, Budget Video Projectors, Value Video Projectors, Premium Video Projectors, Hot Selling Video Projectors\",\n" +
            "        \"product_image_url\": \"https://m.media-amazon.com/images/I/51Qserov2-L._SL500_.jpg\",\n" +
            "        \"related_category\": null,\n" +
            "        \"top_four_products\": \"[\\\"B082F13J55\\\", \\\"B09FF4TJZF\\\", \\\"B07VGCGRV2\\\", \\\"B08DX6983T\\\", \\\"B07TC6SJ4Z\\\", \\\"B087X2GJQ6\\\", \\\"B08PZ6J3RH\\\", \\\"B08V58NBDN\\\", \\\"B099WGDVHR\\\", \\\"B07Y2RCVBM\\\"]\",\n" +
            "        \"small_product_image_url\": \"https://m.media-amazon.com/images/I/51Qserov2-L._SL160_.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"id\": 22,\n" +
            "        \"name\": \"Air Fryers\",\n" +
            "        \"label\": \"Air Fryers\",\n" +
            "        \"region\": \"US\",\n" +
            "        \"description\": \"{'Controls': ['COSORI Smart WiFi Air Fryer 5.8QT(100 Recipes), 1700-Watt Programmable Base for Air Frying, Roasting & Keep Warm 11 Cooking Preset,Preheat&Shake Remind,Digital Touchscreen,2- Year Warranty', 'cosori-smart-wifi-air-fryer-58qt100-recipes-1700-watt-programmable-base-for-air-frying-roasting-keep-warm-11-cooking-presetpreheatshake-reminddigital-touchscreen2-year-warranty'], 'Noise': ['COSORI Smart WiFi Air Fryer 5.8QT(100 Recipes), 1700-Watt Programmable Base for Air Frying, Roasting & Keep Warm 11 Cooking Preset,Preheat&Shake Remind,Digital Touchscreen,2- Year Warranty', 'cosori-smart-wifi-air-fryer-58qt100-recipes-1700-watt-programmable-base-for-air-frying-roasting-keep-warm-11-cooking-presetpreheatshake-reminddigital-touchscreen2-year-warranty'], 'Cleaning': ['Air Fryer, Bagotte Programmable Hot Airfryer Oven & Oilless Cooker for Roasting, LED Digital Touchscreen, Nonstick Basket, Dishwasher Safe, Family Size', 'air-fryer-bagotte-programmable-hot-airfryer-oven-oilless-cooker-for-roasting-led-digital-touchscreen-nonstick-basket-dishwasher-safe-family-size'], 'Measured Capacity (qt.)': ['COSORI Smart WiFi Air Fryer 5.8QT(100 Recipes), 1700-Watt Programmable Base for Air Frying, Roasting & Keep Warm 11 Cooking Preset,Preheat&Shake Remind,Digital Touchscreen,2- Year Warranty', 'cosori-smart-wifi-air-fryer-58qt100-recipes-1700-watt-programmable-base-for-air-frying-roasting-keep-warm-11-cooking-presetpreheatshake-reminddigital-touchscreen2-year-warranty'], 'Recorded Temp when set to 350 (&deg;F)': ['COSORI Smart WiFi Air Fryer 5.8QT(100 Recipes), 1700-Watt Programmable Base for Air Frying, Roasting & Keep Warm 11 Cooking Preset,Preheat&Shake Remind,Digital Touchscreen,2- Year Warranty', 'cosori-smart-wifi-air-fryer-58qt100-recipes-1700-watt-programmable-base-for-air-frying-roasting-keep-warm-11-cooking-presetpreheatshake-reminddigital-touchscreen2-year-warranty']}\",\n" +
            "        \"category_slug\": \"air-fryers\",\n" +
            "        \"featured\": true,\n" +
            "        \"active\": true,\n" +
            "        \"created\": \"2019-12-20\",\n" +
            "        \"home_page_image\": \"air-fryers/images/airfryers_transparent-air-fryers_small.png\",\n" +
            "        \"category_page_image\": \"air-fryers/images/airfryers_transparent-air-fryers.png\",\n" +
            "        \"cached_image\": \"thumbnails/air-fryers.jpg\",\n" +
            "        \"total_reviews\": 389425,\n" +
            "        \"updated_at\": \"2022-08-25T06:20:17.458489Z\",\n" +
            "        \"featurewise_rank\": null,\n" +
            "        \"wp_cat_id\": 66,\n" +
            "        \"featured_order\": 10,\n" +
            "        \"name_chunks\": \"['Air', 'Fryers']\",\n" +
            "        \"meta_desc\": \"Top 554 Air Fryers of 2022 priced between $3 - $79, rated based on Build Quality, Controls and Functionality, Customer Support, Design. Best rated Air Fryers Rank#1 Gevi Air Fryer Toaster Oven Combo\",\n" +
            "        \"meta_keywords\": \"Air Fryers, Best Air Fryers, Cheap Air Fryers, Best Air Fryers of year, Budget Air Fryers, Value Air Fryers, Premium Air Fryers, Philips Air Fryers, GoWISE USA Air Fryers, COSORI Air Fryers, Secura Air Fryers, Instant Pot Air Fryers, DASH Air Fryers, Chefman Air Fryers, NuWave Air Fryers, Ninja Air Fryers, Ultrean Air Fryers, COMFEE Air Fryers, Whall Air Fryers, Iconites Air Fryers, Kalorik Air Fryers, Geek Chef Air Fryers, Himaly Air Fryers, PowerXL Air Fryers, Oster Air Fryers, CROWNFUL Air Fryers, Amazon Basics Air Fryers, Emeril Lagasse Air Fryers, OMMO Air Fryers, Innsky Air Fryers, Yedi Houseware Air Fryers, Big Boss Air Fryers, WEESTA Air Fryers, Hot Selling Air Fryers\",\n" +
            "        \"product_image_url\": \"https://m.media-amazon.com/images/I/41KxYhZTEBL._SL500_.jpg\",\n" +
            "        \"related_category\": \"avocado-oils,dried-white-rice,cake-decorating-kits,humidifier-chemicals,lab-stirrers\",\n" +
            "        \"top_four_products\": \"[\\\"B07FF117K7\\\", \\\"B07FDJMC9Q\\\", \\\"B0978M8136\\\", \\\"B07VWHVCHK\\\", \\\"B07MR3KWSL\\\", \\\"B08XQN69HT\\\", \\\"B08DMYWKD8\\\", \\\"B089ZT66H9\\\", \\\"B0967ZCZQ7\\\", \\\"B093T1VFP8\\\"]\",\n" +
            "        \"small_product_image_url\": \"https://m.media-amazon.com/images/I/41KxYhZTEBL._SL160_.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"id\": 103,\n" +
            "        \"name\": \"Treadmill\",\n" +
            "        \"label\": \"Treadmills\",\n" +
            "        \"region\": \"US\",\n" +
            "        \"description\": \"{'Ergonomics': ['SereneLife Smart Electric Folding Treadmill – Easy Assembly Fitness Motorized Running Jogging Exercise Machine with Manual Incline Adjustment, 12 Preset Programs', 'serenelife-smart-electric-folding-treadmill-easy-assembly-fitness-motorized-running-jogging-exercise-machine-with-manual-incline-adjustment-12-preset-programs'], 'Construction': ['Sunny Health & Fitness SF-T7515 Smart Treadmill with Auto Incline, Sound System, Bluetooth and Phone Function', 'sunny-health-fitness-sf-t7515-smart-treadmill-with-auto-incline-sound-system-bluetooth-and-phone-function'], 'Ease of use': ['SereneLife Smart Electric Folding Treadmill – Easy Assembly Fitness Motorized Running Jogging Exercise Machine with Manual Incline Adjustment, 12 Preset Programs', 'serenelife-smart-electric-folding-treadmill-easy-assembly-fitness-motorized-running-jogging-exercise-machine-with-manual-incline-adjustment-12-preset-programs'], 'Exercise range': ['2 in 1 Under Desk Folding Treadmill,Electric Motorized Portable Pad Treadmills Walking Jogging Running Exercise Fitness Machine with Remote Controller and Bluetooth Speaker for Home Gym Office', '2-in-1-under-desk-folding-treadmillelectric-motorized-portable-pad-treadmills-walking-jogging-running-exercise-fitness-machine-with-remote-controller-and-bluetooth-speaker-for-home-gym-office'], 'User safety': ['Merax Electric Folding Treadmill – Easy Assembly Fitness Motorized Running Jogging Machine with Speakers for Home Use, 12 Preset Programs', 'merax-electric-folding-treadmill-easy-assembly-fitness-motorized-running-jogging-machine-with-speakers-for-home-use-12-preset-programs']}\",\n" +
            "        \"category_slug\": \"treadmill\",\n" +
            "        \"featured\": true,\n" +
            "        \"active\": true,\n" +
            "        \"created\": \"2020-02-11\",\n" +
            "        \"home_page_image\": \"treadmill/images/treadmill_transparent-treadmill_bdfpM2g_small.png\",\n" +
            "        \"category_page_image\": \"treadmill/images/treadmill_transparent-treadmill_bdfpM2g.png\",\n" +
            "        \"cached_image\": \"thumbnails/treadmill.jpg\",\n" +
            "        \"total_reviews\": 102966,\n" +
            "        \"updated_at\": \"2022-09-01T09:29:26.918655Z\",\n" +
            "        \"featurewise_rank\": null,\n" +
            "        \"wp_cat_id\": 146,\n" +
            "        \"featured_order\": 11,\n" +
            "        \"name_chunks\": \"['Treadmill']\",\n" +
            "        \"meta_desc\": \"Top 466 Treadmills of 2022 priced between $2 - $369, rated based on Build Quality, Connectivity, Controls and Functionality, Customer Support. Best rated Treadmills Rank#1 Durafit Panther 2.75 HP (5.5 HP Peak) DC Motorized Treadmill\",\n" +
            "        \"meta_keywords\": \"Treadmills, Best Treadmills, Cheap Treadmills, Best Treadmills of year, Value Treadmills, Budget Treadmills, Premium Treadmills, Weslo treadmill, Ancheer Treadmills, Bowflex Treadmills, Hot Selling Treadmills, ADVENOR Treadmills, ECHANFIT Treadmills, EXERPEUTIC Treadmills, FUNMILY Treadmills, Goplus Treadmills, Horizon Fitness Treadmills, JUSNOVA Treadmills, Merax Treadmills, NordicTrack Treadmills, OppsDecor Treadmills, ProForm Treadmills, REDLIRO Treadmills, SereneLife Treadmills, Sunny Health & Fitness Treadmills, UREVO Treadmills, XTERRA Fitness Treadmills, Z ZELUS Treadmills, Best Choice Products Treadmills, CITYSPORTS Treadmills, Conquer Treadmills, Miageek Treadmills\",\n" +
            "        \"product_image_url\": \"https://m.media-amazon.com/images/I/41Kx6GjNyJL._SL500_.jpg\",\n" +
            "        \"related_category\": \"pull-up-bars\",\n" +
            "        \"top_four_products\": \"[\\\"B08SLP2L99\\\", \\\"B08SBW6F4Y\\\", \\\"B09TP8HF4P\\\", \\\"B08BFV94TQ\\\", \\\"B09BT6VFH9\\\", \\\"B09PYJVCJL\\\", \\\"B09B3M7BCD\\\", \\\"B089QRZMNW\\\", \\\"B09QQS684T\\\", \\\"B09Q87KCPV\\\"]\",\n" +
            "        \"small_product_image_url\": \"https://m.media-amazon.com/images/I/41-Svb6e+zL._SL160_.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"id\": 160,\n" +
            "        \"name\": \"Smart Tv\",\n" +
            "        \"label\": \"Smart TVs\",\n" +
            "        \"region\": \"US\",\n" +
            "        \"description\": \"{'Ease Of Use': ['TCL 65S517 65-Inch 4K Ultra HD Roku Smart LED TV (2018 Model)', 'tcl-65s517-65-inch-4k-ultra-hd-roku-smart-led-tv-2018-model'], 'Owner Satisfaction': ['Samsung Electronics UN49M5300A 49-Inch 1080p Smart LED TV (2017 Model)', 'samsung-electronics-un49m5300a-49-inch-1080p-smart-led-tv-2017-model'], 'Reliability': ['Samsung UN65NU8000FXZA Flat 65\\\" 4K UHD 8 Series Smart LED TV (2018)', 'samsung-un65nu8000fxza-flat-65-4k-uhd-8-series-smart-led-tv-2018'], 'Fast User Interface': ['TCL 55R617 55-Inch 4K Ultra HD Roku Smart LED TV (2018 Model)', 'tcl-55r617-55-inch-4k-ultra-hd-roku-smart-led-tv-2018-model'], 'App Store': ['TCL 55R617 55-Inch 4K Ultra HD Roku Smart LED TV (2018 Model)', 'tcl-55r617-55-inch-4k-ultra-hd-roku-smart-led-tv-2018-model'], 'Ease of installation': ['Samsung QN65Q6FN FLAT 65” QLED 4K UHD 6 Series Smart TV 2018', 'samsung-qn65q6fn-flat-65-qled-4k-uhd-6-series-smart-tv-2018'], 'Controls': ['Sceptre 32  inch LED 720p HDTV 3X HDMI MHL ASTC/QAM, Metal Black 2019 (X328BV-SR)', 'sceptre-32-inch-led-720p-hdtv-3x-hdmi-mhl-astcqam-metal-black-2019-x328bv-sr'], 'Quality': ['Samsung UN65NU8000FXZA Flat 65\\\" 4K UHD 8 Series Smart LED TV (2018)', 'samsung-un65nu8000fxza-flat-65-4k-uhd-8-series-smart-led-tv-2018'], 'Ease of use': ['TCL 65S517 65-Inch 4K Ultra HD Roku Smart LED TV (2018 Model)', 'tcl-65s517-65-inch-4k-ultra-hd-roku-smart-led-tv-2018-model'], 'Owner satisfaction': ['Samsung Electronics UN49M5300A 49-Inch 1080p Smart LED TV (2017 Model)', 'samsung-electronics-un49m5300a-49-inch-1080p-smart-led-tv-2017-model'], 'Wireless': ['Samsung Electronics UN49M5300A 49-Inch 1080p Smart LED TV (2017 Model)', 'samsung-electronics-un49m5300a-49-inch-1080p-smart-led-tv-2017-model'], 'Connectivity': ['TCL 55R617 55-Inch 4K Ultra HD Roku Smart LED TV (2018 Model)', 'tcl-55r617-55-inch-4k-ultra-hd-roku-smart-led-tv-2018-model'], 'Fast user interface': ['TCL 55R617 55-Inch 4K Ultra HD Roku Smart LED TV (2018 Model)', 'tcl-55r617-55-inch-4k-ultra-hd-roku-smart-led-tv-2018-model'], 'Picture quality': ['Samsung UN65NU8000FXZA Flat 65\\\" 4K UHD 8 Series Smart LED TV (2018)', 'samsung-un65nu8000fxza-flat-65-4k-uhd-8-series-smart-led-tv-2018'], 'Sound quality': ['Samsung UN65NU8000FXZA Flat 65\\\" 4K UHD 8 Series Smart LED TV (2018)', 'samsung-un65nu8000fxza-flat-65-4k-uhd-8-series-smart-led-tv-2018'], 'Gaming': ['LG Electronics OLED65C8P 65-Inch 4K Ultra HD Smart OLED TV (2018 Model)', 'lg-electronics-oled65c8p-65-inch-4k-ultra-hd-smart-oled-tv-2018-model'], 'Web browsing': ['LG Electronics 65SK8000 65-Inch 4K Ultra HD Smart LED TV (2018 Model)', 'lg-electronics-65sk8000-65-inch-4k-ultra-hd-smart-led-tv-2018-model'], 'Google assistant compatibility': ['LG Electronics 43UK6300PUE 43-Inch 4K Ultra HD Smart LED TV (2018 Model)', 'lg-electronics-43uk6300pue-43-inch-4k-ultra-hd-smart-led-tv-2018-model'], 'Easy to install': ['TCL 49S325 49  inch 1080p Smart Roku LED TV (2019)', 'tcl-49s325-49-inch-1080p-smart-roku-led-tv-2019']}\",\n" +
            "        \"category_slug\": \"smart-tv\",\n" +
            "        \"featured\": true,\n" +
            "        \"active\": true,\n" +
            "        \"created\": \"2020-02-14\",\n" +
            "        \"home_page_image\": \"smart-tv/images/smart-tv.png\",\n" +
            "        \"category_page_image\": \"smart-tv/images/smart-tv_transparent-smart-tv.png\",\n" +
            "        \"cached_image\": \"thumbnails/smart-tv.jpg\",\n" +
            "        \"total_reviews\": 372614,\n" +
            "        \"updated_at\": \"2022-08-24T09:39:58.099282Z\",\n" +
            "        \"featurewise_rank\": null,\n" +
            "        \"wp_cat_id\": 193,\n" +
            "        \"featured_order\": 12,\n" +
            "        \"name_chunks\": \"['Smart']\",\n" +
            "        \"meta_desc\": \"Top 487 Smart TVs of 2022 priced between $27 - $902, rated based on Build Quality, Compatibility, Connectivity, Customer Support. Best rated Smart TVs Rank#1 4K UHD Dolby Vision HDR QLED ROKU Smart TV\",\n" +
            "        \"meta_keywords\": \"Smart TVs, Best Smart TVs, Cheap Smart TVs, Best Smart TVs of year, Budget Smart TVs, Value Smart TVs, Premium Smart TVs, Hot Selling Smart TVs, Caixun Smart TVs, Hisense Smart TVs, INSIGNIA Smart TVs, LG Smart TVs, Philips Smart TVs, Samsung Smart TVs, SANSUI Smart TVs, Sceptre Smart TVs, Skyworth Smart TVs, Sony Smart TVs, TCL Smart TVs, Toshiba Smart TVs, VIZIO Smart TVs, Westinghouse Smart TVs\",\n" +
            "        \"product_image_url\": \"https://m.media-amazon.com/images/I/41YacLOpv+L._SL500_.jpg\",\n" +
            "        \"related_category\": \"mens-activewear-t-shirts,smart-tv,mens-fleece-jackets-coats,science-fiction-fantasy-art-books,music-techniques-books,womens-novelty-t-shirts,childrens-science-fiction-comics-graphic-novels,mens-novelty-t-shirts,childrens-superhero-comics\",\n" +
            "        \"top_four_products\": \"[\\\"B07FPP6TB5\\\", \\\"B08T6J1HG8\\\", \\\"B08DX6983T\\\", \\\"B08BZXPKFY\\\", \\\"B01N2Z17MS\\\", \\\"B0872FYTWS\\\", \\\"B00VVKCA9C\\\", \\\"B0851CMQRC\\\", \\\"B091YJQGVW\\\", \\\"B07TTF3HJ3\\\"]\",\n" +
            "        \"small_product_image_url\": \"https://m.media-amazon.com/images/I/41YacLOpv+L._SL160_.jpg\"\n" +
            "    }\n" +
            "]";

    public QueryUtilsRecOne() {
    }

    public static ArrayList<DataModel> extractDataModel() {

        ArrayList<DataModel> dataModels = new ArrayList<>();

        String data = "";
        try {
            // Create the root JSONObject from the JSON string.
//            JSONObject jsonRootObject = new JSONObject(SAMPLE_JSON_RESPONSE);

            JSONArray jsonArray = new JSONArray(SAMPLE_JSON_RESPONSE);
//
            //Get the instance of JSONArray that contains JSONObjects
//            JSONArray jsonArray = jsonRootObject.optJSONArray("");

            //Iterate the jsonArray and print the info of JSONObjects
            for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject jsonObject = jsonArray.getJSONObject(i);

//                String image = jsonObject.optString("home_page_image").toString();
//                String productName = jsonObject.optString("label").toString();

                String productName = jsonObject.getString("label");
                String image;

                if(jsonObject.getString("home_page_image").isEmpty()){
                    image = "https://s3-us-west-2.amazonaws.com/data.bestviewsreviews.com/CATEGORY_IMG/no-image.jpg";
                }else{
                    image = "https://d1wi0fywfu3s5z.cloudfront.net/media/" + jsonObject.getString("home_page_image");

                }


                DataModel dataModel = new DataModel(image,productName);
                dataModels.add(dataModel);

            }
        } catch (JSONException e) {
            e.printStackTrace();
        }

      return dataModels;
    }

}



