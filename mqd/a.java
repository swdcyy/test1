package mqd.a;
import java.util.Set;
import java.lang.Comparable;
import mqd.c;
import io.netty.channel.group.a;
import io.netty.channel.ChannelId;
import io.netty.channel.d;
import java.lang.Object;
import java.lang.String;

public interface abstract a implements Set, Comparable	// class@001d39
{

    a A2(c p0);
    a C0(c p0);
    a D0(c p0);
    a G2(c p0);
    d I0(ChannelId p0);
    a K3(Object p0,c p1);
    a O1(Object p0);
    a P();
    a Q(Object p0);
    a R(Object p0);
    a S2(Object p0,c p1);
    a a3(Object p0,c p1);
    a close();
    a disconnect();
    a flush();
    a l1(c p0);
    String name();
    a v2();
}
