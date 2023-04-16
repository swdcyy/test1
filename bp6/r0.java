package bp6.r0;
import j85.a;
import com.kwai.imsdk.internal.v;
import java.lang.Object;
import com.kwai.chat.kwailink.data.PacketData;
import java.util.Objects;
import java.lang.String;
import com.kwai.chat.sdk.signal.BizDispatcher;
import java.util.List;
import java.util.Arrays;
import uo6.b;
import java.lang.Integer;
import java.lang.StringBuilder;
import l85.b;

public final class r0 implements a	// class@000548
{
    public final v a;

    public void r0(v p0){
       this.a = p0;
    }
    public final boolean a(PacketData p0){
       int i2;
       Objects.requireNonNull(this.a);
       String str = p0.k();
       boolean b = true;
       if (BizDispatcher.isMainBiz(str)) {
       }else {
          String str1 = p0.a();
          List list = Arrays.asList(str1.split("\\."));
          int i = 2;
          int i1 = 0;
          if (list.contains("Push")) {
          label_0080 :
             i2 = 0;
          }else {
             String str2 = "Session";
             if (list.contains(str2) && list.contains("Folder")) {
                i2 = 6;
             }else if(list.contains("VoiceCall")){
                i2 = 7;
             }else if(list.contains(str2) && list.contains("Tag")){
                i2 = 5;
             }else if(list.contains("Channel")){
                i2 = 4;
             }else if(list.contains(str2)){
                i2 = 3;
             }else if(list.contains("Group")){
                i2 = 2;
             }else if(list.contains("Message")){
                i2 = 1;
             }else {
                goto label_0080 ;
             }
          }
          b b1 = b.f(str).b;
          i = (i2 != 6 && (i2 != 5 && (i2 == 3 || i2 == i)))? 1: 0;
          if (i && b1.contains(Integer.valueOf(i2))) {
             i1 = 1;
          }
          if (i1) {
             b.i("KwaiIMManagerInternal", "CommandRequestInterceptor intercept command: "+str1+" subBiz: "+str);
          }
          b = b ^ i1;
       }
       return b;
    }
}
