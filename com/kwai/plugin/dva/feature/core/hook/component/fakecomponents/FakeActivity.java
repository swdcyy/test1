package com.kwai.plugin.dva.feature.core.hook.component.fakecomponents.FakeActivity;
import android.app.Activity;
import android.os.Bundle;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import pi7.a;
import android.content.Intent;

public class FakeActivity extends Activity	// class@001307
{

    public void FakeActivity(){
       super();
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FakeActivity.class, "1")) {
          return;
       }
       super.onCreate(p0);
       a.a(this, a.d(this));
       if (this.getIntent() != null) {
          this.setIntent(null);
       }
       this.finish();
       return;
    }
}
