package bm1.a;
import ok.o;
import bm1.b;
import java.lang.Object;
import com.kuaishou.livestream.message.nano.LiveGiftTitleInfo;
import java.util.Objects;
import com.kuaishou.socket.nano.UserInfos$UserInfo;
import java.lang.String;
import p91.m;

public final class a implements o	// class@0003c5
{
    public final b b;

    public void a(b p0){
       this.b = p0;
    }
    public final boolean apply(Object p0){
       a tb = this.b;
       Objects.requireNonNull(tb);
       p0 = p0.namingUser;
       boolean b = (p0 != null)? (tb.a.d()).equals(String.valueOf(p0.userId)): false;
       return b;
    }
}
