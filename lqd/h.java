package lqd.h;
import wqd.a;
import lqd.h$a;
import java.lang.String;
import wqd.i;
import wqd.h;

public class h extends a	// class@001c9c
{
    public static final h A;
    public static final h B;
    public static final h C;
    public static final h D;
    public static final h E;
    public static final h F;
    public static final i f;
    public static final h g;
    public static final h h;
    public static final h i;
    public static final h j;
    public static final h k;
    public static final h l;
    public static final h m;
    public static final h n;
    public static final h o;
    public static final h p;
    public static final h q;
    public static final h r;
    public static final h s;
    public static final h t;
    public static final h u;
    public static final h v;
    public static final h w;
    public static final h x;
    public static final h y;
    public static final h z;

    static {
       h.f = new h$a();
       h.g = h.c("ALLOCATOR");
       h.h = h.c("RCVBUF_ALLOCATOR");
       h.i = h.c("MESSAGE_SIZE_ESTIMATOR");
       h.j = h.c("CONNECT_TIMEOUT_MILLIS");
       h.k = h.c("MAX_MESSAGES_PER_READ");
       h.l = h.c("WRITE_SPIN_COUNT");
       h.m = h.c("WRITE_BUFFER_HIGH_WATER_MARK");
       h.n = h.c("WRITE_BUFFER_LOW_WATER_MARK");
       h.o = h.c("ALLOW_HALF_CLOSURE");
       h.p = h.c("AUTO_READ");
       h.q = h.c("AUTO_CLOSE");
       h.r = h.c("SO_BROADCAST");
       h.s = h.c("SO_KEEPALIVE");
       h.t = h.c("SO_SNDBUF");
       h.u = h.c("SO_RCVBUF");
       h.v = h.c("SO_REUSEADDR");
       h.w = h.c("SO_LINGER");
       h.x = h.c("SO_BACKLOG");
       h.y = h.c("SO_TIMEOUT");
       h.z = h.c("IP_TOS");
       h.A = h.c("IP_MULTICAST_ADDR");
       h.B = h.c("IP_MULTICAST_IF");
       h.C = h.c("IP_MULTICAST_TTL");
       h.D = h.c("IP_MULTICAST_LOOP_DISABLED");
       h.E = h.c("TCP_NODELAY");
       h.F = h.c("DATAGRAM_CHANNEL_ACTIVE_ON_REGISTRATION");
    }
    public void h(int p0,String p1){
       super(p0, p1);
    }
    public void h(String p0){
       i f = h.f;
       i a = f.a;
       _monitor_enter(a);
       i b = f.b;
       f.b = b + 1;
       _monitor_exit(a);
       super(b, p0);
    }
    public static h c(String p0){
       return h.f.b(p0);
    }
}
