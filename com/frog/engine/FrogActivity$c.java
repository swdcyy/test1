package com.frog.engine.FrogActivity$c;
import android.view.View$OnClickListener;
import com.frog.engine.FrogActivity;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.content.Intent;
import android.content.Context;
import android.app.Activity;
import java.lang.ClassNotFoundException;

public class FrogActivity$c implements View$OnClickListener	// class@0014e7
{
    public final FrogActivity a;

    public void FrogActivity$c(FrogActivity p0){
       this.a = p0;
       super();
    }
    public void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FrogActivity$c.class, "1")) {
          return;
       }
       try{
          this.a.startActivity(new Intent(this.a, Class.forName("com.example.androiddemo.MainActivity")));
       }catch(java.lang.ClassNotFoundException e3){
          e3.printStackTrace();
       }
       return;
    }
}
