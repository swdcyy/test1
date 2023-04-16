package com.yxcorp.gifshow.third.BaseDyActivity;
import android.app.Activity;
import android.os.Bundle;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public abstract class BaseDyActivity extends Activity	// class@001d8c
{

    public void BaseDyActivity(){
       super();
    }
    public void a(){
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BaseDyActivity.class, "1")) {
          return;
       }
       super.onCreate(p0);
       this.a();
       this.finish();
       return;
    }
}
