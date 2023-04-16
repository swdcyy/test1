package c98.d;
import w78.c;
import com.mini.guide.GuideMiniManagerImpl;
import java.lang.Object;
import android.os.Message;
import android.os.Bundle;
import java.lang.String;
import n88.a;
import w78.b;
import n88.b;
import com.mini.channel.b;

public final class d implements c	// class@0003c7
{
    public final GuideMiniManagerImpl a;

    public void d(GuideMiniManagerImpl p0){
       this.a = p0;
    }
    public final void a(Message p0){
       d ta = this.a;
       Bundle uBundle = new Bundle();
       uBundle.putBoolean("key_channel_result", ta.T6());
       ta.mCF.i().getChannel().d("key_channel_can_show_new_feature_result", uBundle);
    }
}
