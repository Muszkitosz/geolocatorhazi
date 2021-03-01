package geolocator;

/**
 * Class for wrapping geolocation information about an IP adress.
 */
record GeoLocation(String as, String city, String country, String countrycode, String isp, double lat, double lon, String org, String query, String region, String regionName, String timezone, String zip) {}

