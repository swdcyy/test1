package com.yxcorp.gifshow.push.dialog.spring_dialog.SubProcessDialogActivity;
import androidx.appcompat.app.AppCompatActivity;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import android.view.Window;
import android.app.Activity;
import kotlin.jvm.internal.a;
import android.view.WindowManager$LayoutParams;
import android.os.Bundle;
import android.view.View;
import fv6.a;
import androidx.fragment.app.c;
import androidx.fragment.app.FragmentActivity;

public abstract class SubProcessDialogActivity extends AppCompatActivity	// class@001645
{

    public void SubProcessDialogActivity(){
       super();
    }
    public final void E2(int p0,boolean p1){
       SubProcessDialogActivity subProcessDi = SubProcessDialogActivity.class;
       if (PatchProxy.isSupport(subProcessDi) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Boolean.valueOf(p1), this, subProcessDi, "2")) {
          return;
       }
       Window window = this.getWindow();
       a.o(window, "win");
       WindowManager$LayoutParams attributes = window.getAttributes();
       attributes.flags = (p1)? p0 | attributes.flags: (~ p0) & attributes.flags;
       window.setAttributes(attributes);
       return;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SubProcessDialogActivity.class, "1")) {
          return;
       }
       super.onCreate(p0);
       Window window = this.getWindow();
       a.o(window, "window");
       View decorView = window.getDecorView();
       a.o(decorView, "window.decorView");
       decorView.setSystemUiVisibility(1280);
       this.E2(0x4000000, false);
       window = this.getWindow();
       a.o(window, "window");
       window.setStatusBarColor(false);
       c supportFragm = this.getSupportFragmentManager();
       a.o(supportFragm, "supportFragmentManager");
       new a().a(this, supportFragm);
       return;
    }
}
