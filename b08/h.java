package b08.h;
import erd.g;
import b08.j;
import com.kuaishou.merchant.message.nano.LiveRoomSignalMessage$SCKwaishopResourceLivePendantData;
import java.lang.Object;
import com.kwaishou.merchant.daccore.data.PendantDataServer;

public final class h implements g	// class@0002f2
{
    public final j b;
    public final LiveRoomSignalMessage$SCKwaishopResourceLivePendantData c;

    public void h(j p0,LiveRoomSignalMessage$SCKwaishopResourceLivePendantData p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       this.b.b.m(this.c);
    }
}
