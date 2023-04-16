package com.yxcorp.gifshow.record.album.d1;
import erd.o;
import java.lang.Object;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import com.yxcorp.gifshow.record.album.LocalAlbumUtils;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import yaa.c;
import com.yxcorp.gifshow.edit.draft.model.c;
import yaa.a;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.edit.draft.EditLyric$b;
import com.google.protobuf.GeneratedMessageLite;

public final class d1 implements o	// class@001718
{
    public static final d1 b;

    static {
       d1.b = new d1();
    }
    public void d1(){
       super();
    }
    public final Object apply(Object p0){
       c obj = PatchProxy.applyOneRefs(p0, null, LocalAlbumUtils.class, "23");
       if (obj != PatchProxyResult.class) {
          p0 = obj;
       }else if(LocalAlbumUtils.u(p0)){
          obj = p0.J0();
          obj.c0();
          a uoa = obj.f0();
          if (uoa == null) {
             obj.g(false);
          }else {
             uoa.c0();
             EditLyric$b uob = uoa.k();
             uob.clear();
             uob.build();
             uoa.g(false);
             obj.g(false);
          }
       }
       return p0;
    }
}
