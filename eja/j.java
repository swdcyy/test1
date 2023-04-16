package eja.j;
import erd.g;
import com.yxcorp.gifshow.follow.stagger.presenter.g;
import java.lang.Object;
import sq4.c;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.google.protobuf.nano.MessageNano;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import wkd.b;
import nga.c;
import brd.t;
import cjd.e;
import erd.o;
import crd.b;

public final class j implements g	// class@0026d0
{
    public final g b;

    public void j(g p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       j tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, g.class, "3")) {
       }else {
          try{
             b.a(0x5eeadcc5).m(RequestBody.create(g.u, MessageNano.toByteArray(p0))).map(new e()).subscribe();
          }catch(java.lang.Exception e0){
          }
       }
       return;
    }
}
