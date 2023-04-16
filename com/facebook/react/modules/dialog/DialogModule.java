package com.facebook.react.modules.dialog.DialogModule;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import java.lang.Integer;
import java.lang.Object;
import java.util.Map;
import vd.d;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.modules.dialog.DialogModule$c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.app.Activity;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.c;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.SoftAssertions;
import com.facebook.react.modules.dialog.AlertFragment;
import androidx.fragment.app.DialogFragment;
import cb.a;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.Callback;
import android.os.Bundle;
import com.facebook.react.bridge.ReadableArray;
import java.lang.CharSequence;
import com.facebook.react.modules.dialog.DialogModule$a;
import java.lang.Runnable;

public class DialogModule extends ReactContextBaseJavaModule implements LifecycleEventListener	// class@0012ad
{
    public boolean mIsInForeground;
    public static final Map CONSTANTS;

    static {
       DialogModule.CONSTANTS = d.h("buttonClicked", "buttonClicked", "dismissed", "dismissed", "buttonPositive", Integer.valueOf(-1), "buttonNegative", Integer.valueOf(-2), "buttonNeutral", Integer.valueOf(-3));
    }
    public void DialogModule(ReactApplicationContext p0){
       super(p0);
    }
    public Map getConstants(){
       return DialogModule.CONSTANTS;
    }
    public final DialogModule$c getFragmentManagerHelper(){
       Object[] objArray = null;
       Activity obj = PatchProxy.apply(objArray, this, DialogModule.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.getCurrentActivity();
       if (obj != null && obj instanceof FragmentActivity) {
          objArray = new DialogModule$c(this, obj.getSupportFragmentManager());
       }
       return objArray;
    }
    public String getName(){
       return "DialogManagerAndroid";
    }
    public void initialize(){
       if (PatchProxy.applyVoid(null, this, DialogModule.class, "1")) {
          return;
       }
       this.getReactApplicationContext().addLifecycleEventListener(this);
       return;
    }
    public void onHostDestroy(){
    }
    public void onHostPause(){
       this.mIsInForeground = false;
    }
    public void onHostResume(){
       DialogModule uDialogModul = DialogModule.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uDialogModul, "2")) {
          return;
       }
       this.mIsInForeground = true;
       DialogModule$c fragmentMana = this.getFragmentManagerHelper();
       if (fragmentMana != null) {
          if (!PatchProxy.applyVoid(objArray, fragmentMana, DialogModule$c.class, "1")) {
             UiThreadUtil.assertOnUiThread();
             SoftAssertions.assertCondition(fragmentMana.c.mIsInForeground, "showPendingAlert\(\) called in background");
             if (fragmentMana.b != null) {
                fragmentMana.a();
                fragmentMana.b.show(fragmentMana.a, "com.facebook.catalyst.react.dialog.DialogModule");
                fragmentMana.b = objArray;
             }
          }
       }else {
          a.t(uDialogModul, "onHostResume called but no FragmentManager found");
       }
       return;
    }
    public void showAlert(ReadableMap p0,Callback p1,Callback p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, DialogModule.class, "3")) {
          return;
       }
       DialogModule$c fragmentMana = this.getFragmentManagerHelper();
       int i = 0;
       if (fragmentMana == null) {
          Object[] objArray = new Object[]{"Tried to show an alert while not attached to an Activity"};
          p1.invoke(objArray);
          return;
       }else {
          Bundle uBundle = new Bundle();
          String str = "title";
          if (p0.hasKey(str)) {
             uBundle.putString(str, p0.getString(str));
          }
          str = "message";
          if (p0.hasKey(str)) {
             uBundle.putString(str, p0.getString(str));
          }
          str = "buttonPositive";
          if (p0.hasKey(str)) {
             uBundle.putString("button_positive", p0.getString(str));
          }
          str = "buttonNegative";
          if (p0.hasKey(str)) {
             uBundle.putString("button_negative", p0.getString(str));
          }
          str = "buttonNeutral";
          if (p0.hasKey(str)) {
             uBundle.putString("button_neutral", p0.getString(str));
          }
          str = "items";
          if (p0.hasKey(str)) {
             ReadableArray array = p0.getArray(str);
             CharSequence[] uCharSequenc = new CharSequence[array.size()];
             for (; i < array.size(); i = i + 1) {
                uCharSequenc[i] = array.getString(i);
             }
             uBundle.putCharSequenceArray(str, uCharSequenc);
          }
          if (p0.hasKey("cancelable")) {
             uBundle.putBoolean("cancelable", p0.getBoolean("cancelable"));
          }
          UiThreadUtil.runOnUiThread(new DialogModule$a(this, fragmentMana, uBundle, p2));
          return;
       }
    }
}
