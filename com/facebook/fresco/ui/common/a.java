package com.facebook.fresco.ui.common.a;
import com.facebook.fresco.ui.common.b;
import java.lang.Object;
import java.lang.String;
import java.lang.Throwable;
import com.facebook.fresco.ui.common.b$a;

public class a implements b	// class@0010dd
{
    public static final b NO_OP_LISTENER;

    static {
       a.NO_OP_LISTENER = new a();
    }
    public void a(){
       super();
    }
    public static b getNoOpListener(){
       return a.NO_OP_LISTENER;
    }
    public void onFailure(String p0,Throwable p1,b$a p2){
    }
    public void onFinalImageSet(String p0,Object p1,b$a p2){
    }
    public void onIntermediateImageFailed(String p0){
    }
    public void onIntermediateImageSet(String p0,Object p1){
    }
    public void onRelease(String p0,b$a p1){
    }
    public void onSubmit(String p0,Object p1,b$a p2){
    }
}
