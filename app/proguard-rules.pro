# SQLCipher encryption library rules
-keep class org.zetetic.database.** { *; }
-keep class net.sqlcipher.** { *; }
-dontwarn org.zetetic.database.**
-dontwarn net.sqlcipher.**

# Room Database rules
-keep class * extends androidx.room.RoomDatabase
-keep class * extends androidx.room.RoomDatabase$Callback
-dontwarn androidx.room.paging.**

# Hilt Dependency Injection rules
-keep class * extends android.app.Application
-keep class * extends android.app.Service
-keep class * extends android.content.BroadcastReceiver
-keep class * extends android.content.ContentProvider
-keep class * extends android.app.Activity
-keep class * extends androidx.fragment.app.Fragment

# Keep annotation processors and generated code
-keepattributes *Annotation*,Signature,InnerClasses,EnclosingMethod

# Timber Logging rules
# Remove debug logs in production release builds
-assumenosideeffects class timber.log.Timber {
    public static *** d(...);
    public static *** v(...);
}
