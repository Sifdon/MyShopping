package jgdlws.godlesie.eu.myshopping;

import android.app.Application;

import com.google.android.gms.ads.MobileAds;

/**
 * Created by jgdlws on 01.03.18.
 */

public class MyShoppingApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        // initialize the AdMob app
        MobileAds.initialize(this, getString(R.string.admob_app_id));
        //MobileAds.initialize(this, "ca-app-pub-4983696768930692~6986103032");
    }

}
