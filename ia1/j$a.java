package ia1.j$a;
import uo3.b;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import dx1.a;
import java.lang.StringBuilder;
import com.yxcorp.utility.TextUtils;
import java.util.Objects;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;

public class j$a implements b	// class@00287f
{

    public void j$a(){
       super();
    }
    public void a(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j$a.class, "3")) {
          return;
       }
       a.a(p0);
       return;
    }
    public void b(String p0,String p1,String p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, j$a.class, "2")) {
          return;
       }
       p1 = TextUtils.k(p1)+": "+TextUtils.k(p2);
       Objects.requireNonNull(p0);
       int i = -1;
       switch (p0.hashCode()){
           case 0xe293453:
             if (p0.equals("biz_tag_enter_room")) {
                i = 0;
             }
             break;
           case 0x1b6286e9:
             if (p0.equals("biz_tag_live_common_image")) {
                i = 1;
             }
             break;
           case 0x30a2e6f5:
             if (p0.equals("RED_PACKET_SKIN_BIZ_TAG")) {
                i = 2;
             }
             break;
           default:
       }
       switch (i){
           case 0:
             b.B(LiveLogTag.LIVE_ENTER_ROOM_EFFECT, p1);
             break;
           case 1:
             b.B(LiveLogTag.LIVE_COMMON_IMAGE_FETCH, p1);
             break;
           case 2:
             b.B(LiveLogTag.LIVE_RED_PACKET_SKIN, p1);
             break;
           default:
       }
       return;
    }
    public void c(String p0,String p1,String p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, j$a.class, "1")) {
          return;
       }
       p1 = TextUtils.k(p1)+": "+TextUtils.k(p2);
       Objects.requireNonNull(p0);
       int i = -1;
       switch (p0.hashCode()){
           case 0xe293453:
             if (p0.equals("biz_tag_enter_room")) {
                i = 0;
             }
             break;
           case 0x1b6286e9:
             if (p0.equals("biz_tag_live_common_image")) {
                i = 1;
             }
             break;
           case 0x30a2e6f5:
             if (p0.equals("RED_PACKET_SKIN_BIZ_TAG")) {
                i = 2;
             }
             break;
           default:
       }
       switch (i){
           case 0:
             b.Z(LiveLogTag.LIVE_ENTER_ROOM_EFFECT, p1);
             break;
           case 1:
             b.Z(LiveLogTag.LIVE_COMMON_IMAGE_FETCH, p1);
             break;
           case 2:
             b.Z(LiveLogTag.LIVE_RED_PACKET_SKIN, p1);
             break;
           default:
       }
       return;
    }
}
