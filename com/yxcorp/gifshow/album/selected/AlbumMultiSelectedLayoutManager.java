package com.yxcorp.gifshow.album.selected.AlbumMultiSelectedLayoutManager;
import com.yxcorp.gifshow.album.selected.AlbumSelectedLayoutManager;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.util.AttributeSet;
import androidx.recyclerview.widget.RecyclerView$y;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Number;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import android.view.View;
import java.lang.Integer;
import com.yxcorp.gifshow.album.selected.AlbumSelectedContainer;
import com.yxcorp.gifshow.album.selected.AlbumSelectedContainer$c;

public final class AlbumMultiSelectedLayoutManager extends AlbumSelectedLayoutManager	// class@001a96
{

    public void AlbumMultiSelectedLayoutManager(Context p0){
       a.q(p0, "context");
       super(p0);
    }
    public void AlbumMultiSelectedLayoutManager(Context p0,int p1,boolean p2){
       a.q(p0, "context");
       super(p0, p1, p2);
    }
    public void AlbumMultiSelectedLayoutManager(Context p0,AttributeSet p1,int p2,int p3){
       a.q(p0, "context");
       a.q(p1, "attrs");
       super(p0, p1, p2, p3);
    }
    public int computeHorizontalScrollOffset(RecyclerView$y p0){
       AlbumSelectedContainer$c obj1;
       int i4;
       Object obj = PatchProxy.applyOneRefs(p0, this, AlbumMultiSelectedLayoutManager.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       a.q(p0, "state");
       int i = 0;
       if (!this.getChildCount()) {
          return i;
       }
       try{
          int i1 = this.i0();
          View view = this.findViewByPosition(i1);
          int i2 = (view != null)? (int)view.getX(): 0;
          i2 = - i2;
          for (int i3 = 0; i3 < i1; i3 = i3 + 1) {
             if (PatchProxy.isSupport(AlbumMultiSelectedLayoutManager.class)) {
                obj1 = PatchProxy.applyOneRefs(Integer.valueOf(i3), this, AlbumMultiSelectedLayoutManager.class, "1");
                if (obj1 != PatchProxyResult.class) {
                   i4 = obj1.intValue();
                label_0060 :
                   i2 = i2 + i4;
                }
             }
             obj1 = AlbumSelectedContainer.V0;
             int i5 = obj1.b();
             i4 = (!i3)? obj1.a(): obj1.c();
             i4 = i4 + i5;
             goto label_0060 ;
          }
          i1 = (!i1)? AlbumSelectedContainer.V0.a(): AlbumSelectedContainer.V0.c();
          i = i2 + i1;
          return i;
       }catch(java.lang.Exception e0){
       }
    }
}
