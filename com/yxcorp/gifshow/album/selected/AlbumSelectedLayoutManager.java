package com.yxcorp.gifshow.album.selected.AlbumSelectedLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.yxcorp.gifshow.album.selected.AlbumSelectedLayoutManager$a;
import nsd.u;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.util.AttributeSet;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$y;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.yxcorp.gifshow.album.selected.AlbumSelectedLayoutManager$b;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView$x;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;

public class AlbumSelectedLayoutManager extends LinearLayoutManager	// class@001abf
{
    public float r;
    public static final String s = "AlbumSelectedLayoutManager";
    public static final AlbumSelectedLayoutManager$a t;

    static {
       AlbumSelectedLayoutManager.t = new AlbumSelectedLayoutManager$a(null);
       AlbumSelectedLayoutManager.s = "AlbumSelectedLayoutManager";
    }
    public void AlbumSelectedLayoutManager(Context p0){
       a.q(p0, "context");
       super(p0);
    }
    public void AlbumSelectedLayoutManager(Context p0,int p1,boolean p2){
       a.q(p0, "context");
       super(p0, p1, p2);
    }
    public void AlbumSelectedLayoutManager(Context p0,AttributeSet p1,int p2,int p3){
       a.q(p0, "context");
       a.q(p1, "attrs");
       super(p0, p1, p2, p3);
    }
    public final void W0(float p0){
       this.r = p0;
    }
    public void smoothScrollToPosition(RecyclerView p0,RecyclerView$y p1,int p2){
       if (PatchProxy.isSupport(AlbumSelectedLayoutManager.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, AlbumSelectedLayoutManager.class, "1")) {
          return;
       }
       a.q(p0, "recyclerView");
       AlbumSelectedLayoutManager$b uob = new AlbumSelectedLayoutManager$b(this, p0, p0.getContext());
       uob.p(p2);
       this.startSmoothScroll(uob);
       return;
    }
}
