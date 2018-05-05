package com.zhuan.ndkdemo;

/**
 * description：   <br/>
 * ===============================<br/>
 * creator：Jiacheng<br/>
 * create time：2018/5/5 下午7:13<br/>
 * ===============================<br/>
 * reasons for modification：  <br/>
 * Modifier：  <br/>
 * Modify time：  <br/>
 */
public class JNITest {
    // Used to load the 'native-lib' library on application startup.
    static {
        System.loadLibrary("native-lib"); //这里的cade跟gradle配置的modulename一致
    }

    /**
     * A native method that is implemented by the 'native-lib' native library,
     * which is packaged with this application.
     */
    public native String stringFromJNI(); //native方法
}
