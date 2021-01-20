package com.example.testmap

import android.Manifest
import android.content.pm.PackageManager
import android.content.res.Resources
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat

import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.BitmapDescriptorFactory
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MapStyleOptions
import com.google.android.gms.maps.model.MarkerOptions

class MapsActivity : AppCompatActivity(), OnMapReadyCallback {

    private lateinit var map: GoogleMap
    private val TAG = MapsActivity::class.java.simpleName
    private val REQUEST_LOCATION_PERMISSION = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_maps)
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        val mapFragment = supportFragmentManager
                .findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    override fun onMapReady(googleMap: GoogleMap) {
        map = googleMap
        // Baguio City Coordinates
        val latitude = 16.4023
        val longitude = 120.5960
        val zoomLevel = 15f
        val homeLatLng = LatLng(latitude, longitude)

        // Station 1 Coordinates
        val station1Latitude = 16.41255509612114
        val station1Longitude = 120.57930862324326
        val station1Coordinates = LatLng(station1Latitude, station1Longitude)
        map.moveCamera(CameraUpdateFactory.newLatLngZoom(homeLatLng, zoomLevel))
        val station1 = map.addMarker(
                MarkerOptions()
                        .position(station1Coordinates)
                        .title("Baguio Police Station 1")
                        .snippet("Naguilian Rd, Baguio, Benguet")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        //station1.showInfoWindow()

        // Station 2 Coordinates
        val station2Latitude = 16.42651340479239
        val station2Longitude = 120.59347324416366
        val station2Coordinates = LatLng(station2Latitude, station2Longitude)
        val station2 = map.addMarker(
                MarkerOptions()
                        .position(station2Coordinates)
                        .title("Baguio Police Station 2")
                        .snippet("Quezon Hill Rd 1, Baguio, Benguet")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )

        // Station 3 Coordinates
        val station3Latitude = 16.419376856592077
        val station3Longitude = 120.61545482722876
        val station3Coordinates = LatLng(station3Latitude, station3Longitude)
        val station3 = map.addMarker(
                MarkerOptions()
                        .position(station3Coordinates)
                        .title("Baguio Police Station 3")
                        .snippet("Pacdal Cir, Baguio, Benguet")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )

        // Station 4 Coordinates
        val station4Latitude = 16.379891588741987
        val station4Longitude = 120.6193426269873
        val station4Coordinates = LatLng(station4Latitude, station4Longitude)
        val station4 = map.addMarker(
                MarkerOptions()
                        .position(station4Coordinates)
                        .title("Baguio Police Station 4")
                        .snippet("14 Loakan Rd, Camp John Hay, Baguio, Benguet")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )

        // Station 5 Coordinates
        val station5Latitude = 16.40276902144175
        val station5Longitude = 120.59363287330515
        val station5Coordinates = LatLng(station5Latitude, station5Longitude)
        val station5 = map.addMarker(
                MarkerOptions()
                        .position(station5Coordinates)
                        .title("Baguio Police Station 5")
                        .snippet("Legarda Rd, Baguio, Benguet")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )

        // Station 6 Coordinates
        val station6Latitude = 16.427178566822324
        val station6Longitude = 120.60662162208685
        val station6Coordinates = LatLng(station6Latitude, station6Longitude)
        val station6 = map.addMarker(
                MarkerOptions()
                        .position(station6Coordinates)
                        .title("Baguio Police Station 6")
                        .snippet("158 Bayan Park Rd, Baguio, Benguet")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )

        // Station 7 Coordinates
        val station7Latitude = 16.414359976772403
        val station7Longitude = 120.59211582556271
        val station7Coordinates = LatLng(station7Latitude, station7Longitude)
        val station7 = map.addMarker(
                MarkerOptions()
                        .position(station7Coordinates)
                        .title("Baguio Police Station 7")
                        .snippet("Abanao St, Baguio, 2600 Benguet")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )

        // Station 8 Coordinates
        val station8Latitude = 16.39190039615575
        val station8Longitude = 120.59993659167188
        val station8Coordinates = LatLng(station8Latitude, station8Longitude)
        val station8 = map.addMarker(
                MarkerOptions()
                        .position(station8Coordinates)
                        .title("Baguio Police Station 8")
                        .snippet("Kennon Rd, Baguio, Benguet")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )

        // Station 9 Coordinates
        val station9Latitude = 16.430078859482837
        val station9Longitude = 120.54861648234166
        val station9Coordinates = LatLng(station9Latitude, station9Longitude)
        val station9 = map.addMarker(
                MarkerOptions()
                        .position(station9Coordinates)
                        .title("Baguio Police Station 9")
                        .snippet("Quirino National Hwy, Purok 3, Irisan, Baguio, 2600 Benguet")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )

        // Station 10 Coordinates
        val station10Latitude = 16.38882373236203
        val station10Longitude = 120.57570533788125
        val station10Coordinates = LatLng(station10Latitude, station10Longitude)
        val station10 = map.addMarker(
                MarkerOptions()
                        .position(station10Coordinates)
                        .title("Baguio Police Station 10")
                        .snippet("Marcos Highway 2, Baguio City, Benguet")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )

        setMapStyle(map)
        enableMyLocation()

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.map_options, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem) = when (item.itemId) {
        // Change the map type based on the user's selection.
        R.id.normal_map -> {
            map.mapType = GoogleMap.MAP_TYPE_NORMAL
            true
        }
        R.id.hybrid_map -> {
            map.mapType = GoogleMap.MAP_TYPE_HYBRID
            true
        }
        R.id.satellite_map -> {
            map.mapType = GoogleMap.MAP_TYPE_SATELLITE
            true
        }
        R.id.terrain_map -> {
            map.mapType = GoogleMap.MAP_TYPE_TERRAIN
            true
        }
        else -> super.onOptionsItemSelected(item)
    }

    private fun setMapStyle(map: GoogleMap) {
        try {
            // Customize the styling of the base map using a JSON object defined
            // in a raw resource file.
            val success = map.setMapStyle(
                    MapStyleOptions.loadRawResourceStyle(
                            this,
                            R.raw.map_style
                    )
            )
            if (!success) {
                Log.e(TAG, "Style parsing failed.")
            }
        } catch (e: Resources.NotFoundException) {
            Log.e(TAG, "Can't find style. Error: ", e)
        }
    }

    // Checks that users have given permission
    private fun isPermissionGranted() : Boolean {
        return ContextCompat.checkSelfPermission(
                this,
                Manifest.permission.ACCESS_FINE_LOCATION) == PackageManager.PERMISSION_GRANTED
    }

    // Checks if users have given their location and sets location enabled if so.
    private fun enableMyLocation() {
        if (isPermissionGranted()) {
            if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
                // TODO: Consider calling
                //    ActivityCompat#requestPermissions
                // here to request the missing permissions, and then overriding
                //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
                //                                          int[] grantResults)
                // to handle the case where the user grants the permission. See the documentation
                // for ActivityCompat#requestPermissions for more details.
                return
            }
            map.isMyLocationEnabled = true
        }
        else {
            ActivityCompat.requestPermissions(
                    this,
                    arrayOf<String>(Manifest.permission.ACCESS_FINE_LOCATION),
                    REQUEST_LOCATION_PERMISSION
            )
        }
    }

    // Callback for the result from requesting permissions.
    // This method is invoked for every call on requestPermissions(android.app.Activity, String[],
    // int).
    override fun onRequestPermissionsResult(
            requestCode: Int,
            permissions: Array<String>,
            grantResults: IntArray) {
        // Check if location permissions are granted and if so enable the
        // location data layer.
        if (requestCode == REQUEST_LOCATION_PERMISSION) {
            if (grantResults.contains(PackageManager.PERMISSION_GRANTED)) {
                enableMyLocation()
            }
        }
    }



}