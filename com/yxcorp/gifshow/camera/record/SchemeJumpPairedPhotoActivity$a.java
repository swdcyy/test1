package com.yxcorp.gifshow.camera.record.SchemeJumpPairedPhotoActivity$a;
import jkd.c;
import com.yxcorp.gifshow.camera.record.SchemeJumpPairedPhotoActivity;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;

public class SchemeJumpPairedPhotoActivity$a implements c	// class@001c95
{
    public final SchemeJumpPairedPhotoActivity a;

    public void SchemeJumpPairedPhotoActivity$a(SchemeJumpPairedPhotoActivity p0){
       this.a = p0;
       super();
    }
    public void onCancel(){
       if (PatchProxy.applyVoid(null, this, SchemeJumpPairedPhotoActivity$a.class, "3")) {
          return;
       }
       this.a.finish();
       return;
    }
    public void onFail(int p0,String p1){
       if (PatchProxy.isSupport(SchemeJumpPairedPhotoActivity$a.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, SchemeJumpPairedPhotoActivity$a.class, "2")) {
          return;
       }
       this.a.finish();
       return;
    }
    public void onSuccess(){
       if (PatchProxy.applyVoid(null, this, SchemeJumpPairedPhotoActivity$a.class, "1")) {
          return;
       }
       this.a.finish();
       return;
    }
}
