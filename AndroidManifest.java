<?xml version="1.0" encoding="utf-8"?>
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
    package="com.example.e_contact1"
    android:versionCode="1"
    android:versionName="1.0" >

    <uses-sdk
        android:minSdkVersion="11"
        android:targetSdkVersion="16" />

    <uses-permission android:name="android.permission.CALL_PHONE" />
    <uses-permission android:name="android.permission.SEND_SMS" />
    <uses-permission android:name="android.permission.READ_CONTACTS" />

    <permission
        android:name="com.example.e_contact1.permission.MAPS_RECEIVE"
        android:protectionLevel="signature" />

    <uses-permission android:name="com.example.e_contact1.permission.MAPS_RECEIVE" />
    <uses-permission android:name="android.permission.INTERNET" />
    <uses-permission android:name="android.permission.ACCESS_NETWORK_STATE" />
    <uses-permission android:name="android.permission.WRITE_EXTERNAL_STORAGE" />
    <uses-permission android:name="com.google.android.providers.gsf.permission.READ_GSERVICES" />
    <!--
     The following two permissions are not required to use
     Google Maps Android API v2, but are recommended.

    -->
    <!-- <uses-permission android:name="android.permission.ACCESS_COARSE_LOCATION" /> -->
    <uses-permission android:name="android.permission.ACCESS_FINE_LOCATION" />
    <uses-permission android:name="android.permission.ACCESS_WIFI_STATE" />
    <uses-permission android:name="android.permission.CHANGE_WIFI_STATE" />
    <uses-permission android:name="android.permission.CHANGE_NETWORK_STATE" />

    <uses-feature
        android:glEsVersion="0x00020000"
        android:required="true" />

    <application
        android:allowBackup="true"
        android:icon="@drawable/ic_launcher"
        android:label="@string/app_name"
        android:theme="@style/AppTheme" >

        <!-- android:configChanges = -->
        <meta-data
            android:name="com.google.android.maps.v2.API_KEY"
            android:value="AIzaSyDUtBiq-X-43avcuPm7rouLrGkcP9naRfQ" />

        <activity
            android:name=".MainActivity"
            android:label="@string/app_name"
            android:windowSoftInputMode="stateHidden" >
            <intent-filter>
                <action android:name="android.intent.action.MAIN" />

                <category android:name="android.intent.category.LAUNCHER" />
            </intent-filter>
        </activity>
        <activity
            android:name=".Settings"
            android:configChanges="orientation|keyboardHidden"
            android:label="@string/app_name"
            android:launchMode="standard"
            android:windowSoftInputMode="stateHidden" >
        </activity>
        <activity
            android:name=".updateEM"
            android:configChanges="orientation|keyboardHidden"
            android:label="@string/app_name"
            android:launchMode="standard"
            android:windowSoftInputMode="stateHidden" >
        </activity>
        <activity
            android:name=".UpdateUser"
            android:configChanges="orientation|keyboardHidden"
            android:label="@string/app_name"
            android:launchMode="standard"
            android:windowSoftInputMode="stateHidden" >
        </activity>
        <activity
            android:name=".Registration"
            android:configChanges="orientation|keyboardHidden"
            android:label="@string/app_name"
            android:launchMode="standard"
            android:windowSoftInputMode="stateHidden" >
        </activity>
        <activity
            android:name=".BloodBank"
            android:label="@string/app_name"
            android:launchMode="standard"
            android:windowSoftInputMode="stateHidden" >
        </activity>
        <activity
            android:name=".PreviewSMS"
            android:configChanges="orientation|keyboardHidden"
            android:label="@string/app_name"
            android:launchMode="standard"
            android:windowSoftInputMode="stateHidden" >
        </activity>

        <service android:name=".PreviewSMS" />

        <activity
            android:name=".Maps"
            android:label="@string/title_activity_maps" >
        </activity>
        <activity
            android:name=".Sos"
            android:label="@string/app_name"
            android:launchMode="standard"
            android:windowSoftInputMode="stateHidden" >
        </activity>
        <activity
            android:name=".DatabaseActivity"
            android:label="@string/title_activity_database" >
        </activity>
        <activity
            android:name=".SQLiteHelper"
            android:label="@string/title_activity_sqlite_helper" >
        </activity>
        <activity
            android:name=".PopUpActivity"
            android:label="@string/title_activity_pop_up" >
        </activity>
        <activity
            android:name=".DirectionActivity"
            android:label="@string/title_activity_direction" >
        </activity>

        <uses-library
            android:name="com.google.android.maps"
            android:required="false" />

        <activity
            android:name=".NewMap"
            android:label="@string/title_activity_new_map" >
        </activity>
    </application>

</manifest>
