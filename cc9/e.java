package cc9.e;
import cc9.c;
import java.lang.String;
import com.yxcorp.gifshow.camera.record.assistant.model.AssistantResponse;
import java.lang.Object;
import kotlin.jvm.internal.a;
import nsd.u;

public final class e extends c	// class@00050a
{
    public final String b;
    public final int c;
    public final boolean d;
    public final AssistantResponse e;

    public void e(String p0,int p1,boolean p2,AssistantResponse p3){
       a.p(p0, "taskId");
       super(2);
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
    }
    public void e(String p0,int p1,boolean p2,AssistantResponse p3,int p4,u p5){
       if (p4 & 0x04) {
          p2 = false;
       }
       super(p0, p1, p2, null);
       return;
    }
    public final AssistantResponse b(){
       return this.e;
    }
}
