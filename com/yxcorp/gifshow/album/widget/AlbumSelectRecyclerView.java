package com.yxcorp.gifshow.album.widget.AlbumSelectRecyclerView;
import androidx.recyclerview.widget.RecyclerView;
import com.yxcorp.gifshow.album.widget.AlbumSelectRecyclerView$a;
import nsd.u;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.util.AttributeSet;
import android.view.MotionEvent;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.view.ViewGroup;

public final class AlbumSelectRecyclerView extends RecyclerView	// class@001b03
{
    public float b;
    public float c;
    public float d;
    public float e;
    public boolean f;
    public HashMap g;
    public static final String h = "AlbumSelectRecyclerView";
    public static final AlbumSelectRecyclerView$a i;

    static {
       AlbumSelectRecyclerView.i = new AlbumSelectRecyclerView$a(null);
       AlbumSelectRecyclerView.h = "AlbumSelectRecyclerView";
    }
    public void AlbumSelectRecyclerView(Context p0){
       a.q(p0, "context");
       super(p0);
    }
    public void AlbumSelectRecyclerView(Context p0,AttributeSet p1){
       a.q(p0, "context");
       super(p0, p1);
    }
    public void AlbumSelectRecyclerView(Context p0,AttributeSet p1,int p2){
       a.q(p0, "context");
       super(p0, p1, p2);
    }
    public boolean dispatchTouchEvent(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, AlbumSelectRecyclerView.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.q(p0, "ev");
       if (this.f != null && !p0.getAction()) {
          float x = p0.getX();
          float y = p0.getY();
          AlbumSelectRecyclerView tc = this.c;
          if (x - this.b >= 0 && (x - tc <= 0 && (y - this.d >= 0 && y - this.e <= 0))) {
             return false;
          }
       }
    label_0044 :
       return super.dispatchTouchEvent(p0);
    }
    public final void setNeedIntercept(boolean p0){
       this.f = p0;
    }
}
