package com.vivo.push.b.o;
import com.vivo.push.b.v;
import com.vivo.push.a;
import java.lang.String;
import com.vivo.push.model.UnvarnishedMessage;
import java.lang.CharSequence;
import android.text.TextUtils;

public final class o extends v	// class@00103e
{
    public UnvarnishedMessage a;

    public void o(){
       super(3);
    }
    public final void c(a p0){
       super.c(p0);
       p0.a("msg_v1", this.a.unpackToJson());
    }
    public final String d(){
       o ta = this.a;
       if (ta == null) {
          return null;
       }
       return ta.unpackToJson();
    }
    public final void d(a p0){
       super.d(p0);
       String str = p0.a("msg_v1");
       if (!TextUtils.isEmpty(str)) {
          UnvarnishedMessage unvarnishedM = new UnvarnishedMessage(str);
          this.a = unvarnishedM;
          unvarnishedM.setMsgId(this.f());
       }
       return;
    }
    public final UnvarnishedMessage e(){
       return this.a;
    }
    public final String toString(){
       return "OnMessageCommand";
    }
}
