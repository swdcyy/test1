package j6.a;
import m6.a$b;
import java.lang.String;
import java.lang.Object;
import java.util.List;
import java.util.Collections;
import java.util.Objects;

public class a	// class@002231
{
    public static String a = "";
    public static final a$b b;
    public static final a$b c;
    public static List d;

    static {
       a$b uob = new a$b("com.eg.android.AlipayGphone", 73, "b6cbad6cbd5ed0d209afc69ad3b7a617efaae9b3c47eabe0be42d924936fa78c8001b1fd74b079e5ff9690061dacfa4768e981a526b9ca77156ca36251cf2f906d105481374998a7e6e6e18f75ca98b8ed2eaf86ff402c874cca0a263053f22237858206867d210020daa38c48b20cc9dfd82b44a51aeb5db459b22794e2d649");
       a.b = uob;
       a.c = new a$b("hk.alipay.wallet", 40, "e6b1bdcb890370f2f2419fe06d0fdf7628ad0083d52da1ecfe991164711bbf9297e75353de96f1740695d07610567b1240549af9cbd87d06919ac31c859ad37ab6907c311b4756e1e208775989a4f691bff4bbbc58174d2a96b1d0d970a05114d7ee57dfc33b1bafaf6e0d820e838427018b6435f903df04ba7fd34d73f843df9434b164e0220baabb10c8978c3f4c6b7da79d8220a968356d15090dea07df9606f665cbec14d218dd3d691cce2866a58840971b6a57b76af88b1a65fdffd2c080281a6ab20be5879e0330eb7ff70871ce684e7174ada5dc3159c461375a0796b17ce7beca83cf34f65976d237aee993db48d34a4e344f4d8b7e99119168bdd7");
       a.d = Collections.singletonList(uob);
    }
    public static void a(String p0){
       a.a = p0;
       Objects.requireNonNull(p0);
       a.d = (!p0.equals("hk"))? Collections.singletonList(a.b): Collections.singletonList(a.c);
       return;
    }
}
