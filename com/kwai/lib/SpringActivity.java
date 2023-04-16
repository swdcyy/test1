package com.kwai.lib.SpringActivity;
import androidx.appcompat.app.AppCompatActivity;
import android.view.Window;
import android.app.Activity;
import android.view.WindowManager$LayoutParams;
import android.content.res.Resources;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;
import android.os.Bundle;
import android.view.View;
import fv6.a;
import androidx.fragment.app.c;
import androidx.fragment.app.FragmentActivity;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;

public final class SpringActivity extends AppCompatActivity	// class@000814
{

    public void SpringActivity(){
       super();
    }
    public final void E2(int p0,boolean p1){
       Window window = this.getWindow();
       WindowManager$LayoutParams attributes = window.getAttributes();
       attributes.flags = (p1)? p0 | attributes.flags: (~ p0) & attributes.flags;
       window.setAttributes(attributes);
       return;
    }
    public Resources getResources(){
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public void onCreate(Bundle p0){
       super.onCreate(p0);
       this.getWindow().getDecorView().setSystemUiVisibility(1280);
       this.E2(0x4000000, false);
       this.getWindow().setStatusBarColor(false);
       c supportFragm = this.getSupportFragmentManager();
       a.o(supportFragm, "supportFragmentManager");
       new a().a(this, supportFragm);
    }
}
