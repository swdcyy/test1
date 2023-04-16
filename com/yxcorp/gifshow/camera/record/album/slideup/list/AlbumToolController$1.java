package com.yxcorp.gifshow.camera.record.album.slideup.list.AlbumToolController$1;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.yxcorp.gifshow.camera.record.album.slideup.list.h;
import android.content.Context;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.camera.record.widget.BottomSheetBehavior;

public class AlbumToolController$1 extends LinearLayoutManager	// class@001cd0
{
    public final h r;

    public void AlbumToolController$1(h p0,Context p1,int p2,boolean p3){
       this.r = p0;
       super(p1, p2, p3);
    }
    public boolean canScrollHorizontally(){
       Object obj = PatchProxy.apply(null, this, AlbumToolController$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.r.p.getState() == 3 || this.r.p.getState() == 6)? true: false;
       return b;
    }
}
