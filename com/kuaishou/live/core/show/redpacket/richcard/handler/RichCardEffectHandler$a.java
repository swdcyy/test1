package com.kuaishou.live.core.show.redpacket.richcard.handler.RichCardEffectHandler$a;
import zs6.a$a;
import com.kuaishou.live.core.show.redpacket.richcard.handler.RichCardEffectHandler;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.show.redpacket.richcard.core.LiveRichCardStateManager;
import pp.c;
import java.util.List;
import com.kuaishou.android.live.log.b;
import yh2.d;
import msd.a;
import java.io.File;
import java.net.URI;
import java.net.URL;
import java.lang.Throwable;

public final class RichCardEffectHandler$a implements a$a	// class@000f7b
{
    public final RichCardEffectHandler a;

    public void RichCardEffectHandler$a(RichCardEffectHandler p0){
       this.a = p0;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, RichCardEffectHandler$a.class, "3")) {
          return;
       }
       b.P(LiveRichCardStateManager.h.f().appendTag(this.a.a), "[krnDownLoadListener][canceled]:��Դ���عرգ��ֶ������������");
       d.a("��Ч�ļ�����ȡ��");
       this.a.a().invoke();
       return;
    }
    public void b(long p0,long p1){
    }
    public void c(File p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RichCardEffectHandler$a.class, "2")) {
          return;
       }
       d.a("��Ч�ļ��������");
       if (p0 != null) {
          try{
             this.a.d(p0.toURI().toURL().toString());
          }catch(java.lang.Exception e4){
             d.a("��Ч�ļ�������� -- �쳣");
             this.a.c();
             b.S(LiveRichCardStateManager.h.f().appendTag(this.a.a), "[krnDownLoadListener][completed]:exception", "e", e4);
          }
       }
    }
    public void error(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RichCardEffectHandler$a.class, "4")) {
          return;
       }
       b.P(LiveRichCardStateManager.h.f().appendTag(this.a.a), "[krnDownLoadListener][error]:��Դ����ʧ�ܣ��ֶ������������");
       d.a("��Ч�ļ����ش���");
       this.a.a().invoke();
       return;
    }
    public void start(){
       if (PatchProxy.applyVoid(null, this, RichCardEffectHandler$a.class, "1")) {
          return;
       }
       d.a("��ʼ������Ч");
       return;
    }
}
