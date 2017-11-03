package ca.evilnut.logutil;

import android.util.Log;

/**
 * Created by Evilnut2 on 2017-11-02.
 */

public class LogDebug {

    private static final String TAG = "SUPER_AWESOME_APP";

    public static void d(String message) {
        Log.d(TAG, message);
    }

}
