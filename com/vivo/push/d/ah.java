package com.vivo.push.d.ah;
import com.vivo.push.l;
import com.vivo.push.o;
import java.lang.StringBuilder;
import java.lang.String;
import java.lang.Object;
import com.vivo.push.util.p;
import android.content.Context;
import com.vivo.push.model.b;
import com.vivo.push.util.t;
import com.vivo.push.b.c;
import com.vivo.push.util.s;
import com.vivo.push.e;
import com.vivo.push.cache.ClientConfigManagerImpl;
import com.vivo.push.b.w;
import com.vivo.push.util.b;
import java.lang.Exception;
import com.vivo.push.b.e;
import com.vivo.push.a.a;

public final class ah extends l	// class@00105f
{

    public void ah(o p0){
       super(p0);
    }
    public final void a(o p0){
       e uoe;
       l ta = this.a;
       String str = "SendCommandTask ";
       if (ta == null) {
          p.d("SendCommandTask", str+p0+" ; mContext is Null");
          return;
       }else if(p0 == null){
          p.d("SendCommandTask", "SendCommandTask pushCommand is Null");
          return;
       }else {
          b uob = t.a(ta);
          int i = p0.b();
          if (i != 2009) {
             if (i != 2011) {
                switch (i){
                    case 2002:
                    case 2004:
                    case 2005:
                    case 2003:
                      if (uob == null || uob.c()) {
                         e.a().a(p0.h(), 1005);
                      }else {
                         c uoc = p0;
                         int i1 = s.a(uoc);
                         if (i1) {
                            e.a().a(uoc.h(), i1);
                            return;
                         }
                      }
                      break;
                    default:
                }
             }else {
                p.a(ClientConfigManagerImpl.getInstance(this.a).isDebug(p0.d()));
             }
          }else {
             p.a(ClientConfigManagerImpl.getInstance(this.a).isDebug());
             if (p.a()) {
                e.a().i();
                b uob1 = new b();
                uob1.a(this.a, "com.vivo.push_preferences.hybridapptoken_v1");
                uob1.a();
                uob1 = new b();
                uob1.a(this.a, "com.vivo.push_preferences.appconfig_v1");
                uob1.a();
                if (!e.a().e()) {
                   ClientConfigManagerImpl.getInstance(this.a).clearPush();
                }
             }
          }
          if (uob == null) {
             p.d("SendCommandTask", str+p0+" ; pushPkgInfo is Null");
             return;
          }else {
             String str1 = uob.a();
             if (uob.c()) {
                try{
                   e.a().a(p0.h(), 1004);
                }catch(java.lang.Exception e7){
                   e7.printStackTrace();
                }
                uoe = new e();
                p.d("SendCommandTask", str+uoe+" ; pkgName is InBlackList ");
             }
             a.a(this.a, str1, uoe);
             return;
          }
       }
    }
}
