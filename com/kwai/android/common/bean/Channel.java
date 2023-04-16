package com.kwai.android.common.bean.Channel;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class Channel extends Enum	// class@00097b
{
    public final String classPath;
    public final boolean isLoadable;
    public final boolean isSupportWorkThreadInit;
    public final int type;
    public static final Channel[] $VALUES;
    public static final Channel CONTACT;
    public static final Channel FIREBASE;
    public static final Channel HONOR;
    public static final Channel HUAWEI;
    public static final Channel KS;
    public static final Channel LOCAL;
    public static final Channel LONGINUS;
    public static final Channel MATRIX;
    public static final Channel MATRIX_GETUI;
    public static final Channel MATRIX_JPUSH;
    public static final Channel MEIZU;
    public static final Channel OPPO;
    public static final Channel VIVO;
    public static final Channel XIAOMI;

    static {
       Channel uChannel = new Channel("XIAOMI", 0, 1, "com.kwai.android.register.XiaoMiRegister");
       Channel.XIAOMI = uChannel;
       Channel uChannel1 = new Channel("HUAWEI", 1, 2, "com.kwai.android.register.HuaWeiRegister");
       Channel.HUAWEI = uChannel1;
       Channel uChannel2 = new Channel("MEIZU", 2, 3, "com.kwai.android.register.MeizuRegister", true);
       Channel.MEIZU = v4;
       Channel uChannel3 = new Channel("OPPO", 3, 8, "com.kwai.android.register.OppoRegister", true);
       Channel.OPPO = v6;
       uChannel2 = new Channel("VIVO", 4, 9, "com.kwai.android.register.VivoRegister", true);
       Channel.VIVO = uChannel3;
       Channel uChannel4 = new Channel("FIREBASE", 5, 6, "com.kwai.android.register.FirebaseRegister", true);
       Channel.FIREBASE = uChannel2;
       Channel uChannel5 = new Channel("KS", 6, 11, "com.kwai.android.register.KuaiShouRegister");
       Channel.KS = uChannel5;
       Channel uChannel6 = new Channel("HONOR", 7, 12, "com.kwai.android.register.HonorRegister");
       Channel.HONOR = uChannel6;
       Channel uChannel7 = new Channel("LOCAL", 8, 13, "", false, false);
       Channel.LOCAL = v11;
       Channel uChannel8 = new Channel("CONTACT", 9, 95, "", false, false);
       Channel.CONTACT = v12;
       uChannel7 = new Channel("MATRIX_JPUSH", 10, 96, "", false, false);
       Channel.MATRIX_JPUSH = uChannel8;
       Channel uChannel9 = new Channel("MATRIX_GETUI", 11, 97, "", false, false);
       Channel.MATRIX_GETUI = uChannel7;
       Channel uChannel10 = new Channel("LONGINUS", 12, 98, "", false, false);
       Channel.LONGINUS = v18;
       uChannel9 = new Channel("MATRIX", 13, 99, "", false, false);
       Channel.MATRIX = v19;
       Channel[] uChannelArra = new Channel[14];
       uChannelArra[0] = uChannel;
       uChannelArra[1] = uChannel1;
       uChannelArra[2] = v4;
       uChannelArra[3] = v6;
       uChannelArra[4] = uChannel3;
       uChannelArra[5] = uChannel2;
       uChannelArra[6] = uChannel5;
       uChannelArra[7] = uChannel6;
       uChannelArra[8] = v11;
       uChannelArra[9] = v12;
       uChannelArra[10] = uChannel8;
       uChannelArra[11] = uChannel7;
       uChannelArra[12] = v18;
       uChannelArra[13] = v19;
       Channel.$VALUES = uChannelArra;
    }
    public void Channel(String p0,int p1,int p2,String p3){
       super(p0, p1, p2, p3, false);
    }
    public void Channel(String p0,int p1,int p2,String p3,boolean p4){
       super(p0, p1, p2, p3, p4, true);
    }
    public void Channel(String p0,int p1,int p2,String p3,boolean p4,boolean p5){
       super(p0, p1);
       this.type = p2;
       this.classPath = p3;
       this.isSupportWorkThreadInit = p4;
       this.isLoadable = p5;
    }
    public static Channel valueOf(String p0){
       return Enum.valueOf(Channel.class, p0);
    }
    public static Channel[] values(){
       return Channel.$VALUES.clone();
    }
}
