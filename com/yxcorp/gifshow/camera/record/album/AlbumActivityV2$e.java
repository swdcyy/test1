package com.yxcorp.gifshow.camera.record.album.AlbumActivityV2$e;
import com.yxcorp.gifshow.album.IAlbumMainFragment$h;
import com.yxcorp.gifshow.camera.record.album.AlbumActivityV2;
import java.lang.Object;
import r79.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.localwork.model.LongVideoLocalProject;
import java.util.List;

public class AlbumActivityV2$e implements IAlbumMainFragment$h	// class@001ca3
{
    public final AlbumActivityV2 a;

    public void AlbumActivityV2$e(AlbumActivityV2 p0){
       this.a = p0;
       super();
    }
    public boolean a(c p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, AlbumActivityV2$e.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (!p0.isVideoType() || p0.getDuration() - LongVideoLocalProject.e(b) >= 0) {
          b = false;
       }
       return b;
    }
    public void b(List p0,boolean p1,String p2,String p3,String p4){
       AlbumActivityV2$e uoe = AlbumActivityV2$e.class;
       if (PatchProxy.isSupport(uoe)) {
          Object[] objArray = new Object[]{p0,Boolean.valueOf(p1),p2,p3,p4};
          if (PatchProxy.applyVoid(objArray, this, uoe, "2")) {
             return;
          }
       }
       this.a.M3(p0, p1, p2, p3, p4, true);
       return;
    }
}
