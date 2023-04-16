package ekd.f0;
import java.util.Locale;
import java.text.Collator;
import java.lang.Object;
import com.yxcorp.utility.SystemUtil;
import java.lang.String;
import com.yxcorp.utility.Log;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.util.ArrayList;
import java.lang.StringBuilder;
import java.util.Iterator;
import ekd.f0$a;
import ekd.n0;
import java.lang.Character;

public class f0	// class@000d45
{
    public final boolean a;
    public static final char[] b;
    public static final byte[][] c;
    public static final Collator d;
    public static f0 e;

    static {
       f0.b = new char[407]{0x5475,0x54ce,0x5b89,0x80ae,0x51f9,0x516b,0x6300,0x6273,0x90a6,0x5305,0x5351,0x5954,0x4f3b,0x5c44,0x8fb9,0x6807,0x618b,0x90a0,0x69df,0x7676,0x5cec,0x5693,0x5a47,0x98e1,0x4ed3,0x64cd,0x518a,0x5d7e,0x564c,0x53c9,0x9497,0x8fbf,0x4f25,0x6284,0x8f66,0x62bb,0x67fd,0x5403,0x5145,0x62bd,0x51fa,0x6b3b,0x63e3,0x5ddd,0x75ae,0x5439,0x6776,0x9034,0x75b5,0x5306,0x51d1,0x7c97,0x6c46,0x5d14,0x90a8,0x6413,0x5491,0x5927,0x75b8,0x5f53,0x5200,0x6dc2,0x5f97,0x6265,0x706f,0x6c10,0x55f2,0x7538,0x5201,0x7239,0x4ec3,0x4e1f,0x4e1c,0x5517,0x561f,0x5073,0x5806,0x9413,0x591a,0x5a40,0x8bf6,0x5940,0x97a5,0x800c,0x53d1,0x5e06,0x65b9,0x98de,0x5206,0x4e30,0x8985,0x4ecf,0x7d11,0x4f15,0x65ee,0x8be5,0x7518,0x5188,0x768b,0x6208,0x7d66,0x6839,0x5e9a,0x5de5,0x52fe,0x4f30,0x74dc,0x7f6b,0x5173,0x5149,0x5f52,0x886e,0x5459,0x54c8,0x54b3,0x9878,0x82c0,0x84bf,0x8bc3,0x9ed2,0x62eb,0x4ea8,0x5677,0x543d,0x9f41,0x5322,0x82b1,0x6000,0x72bf,0x5ddf,0x7070,0x660f,0x5419,0x4e0c,0x52a0,0x620b,0x6c5f,0x827d,0x9636,0x5dfe,0x52a4,0x5182,0x52fc,0x530a,0x5a1f,0x5658,0x519b,0x5494,0x5f00,0x520a,0x95f6,0x5c3b,0x533c,0x524b,0x80af,0x962c,0x7a7a,0x62a0,0x5233,0x5938,0x84af,0x5bbd,0x5321,0x4e8f,0x5764,0x6269,0x5783,0x6765,0x5170,0x5577,0x635e,0x4ec2,0x52d2,0x5844,0x5215,0x5006,0x5941,0x826f,0x64a9,0x5217,0x62ce,0x3007,0x6e9c,0x9f99,0x779c,0x565c,0x5a08,0x7567,0x62a1,0x7f57,0x5463,0x5988,0x973e,0x5ada,0x9099,0x732b,0x9ebc,0x6c92,0x95e8,0x753f,0x54aa,0x7720,0x55b5,0x54a9,0x6c11,0x540d,0x8c2c,0x6478,0x54de,0x6bea,0x62cf,0x5b7b,0x56e1,0x56ca,0x5b6c,0x8bb7,0x9981,0x6041,0x80fd,0x59ae,0x62c8,0x5b22,0x9e1f,0x634f,0x60a8,0x5b81,0x599e,0x519c,0x7fba,0x5974,0x597b,0x8650,0x632a,0x5594,0x8bb4,0x8db4,0x62cd,0x7705,0x4e53,0x629b,0x5478,0x55b7,0x5309,0x4e15,0x504f,0x527d,0x6c15,0x59d8,0x4e52,0x948b,0x5256,0x4ec6,0x4e03,0x6390,0x5343,0x545b,0x6084,0x767f,0x4fb5,0x9751,0x909b,0x4e18,0x66f2,0x5f2e,0x7f3a,0x590b,0x5465,0x7a63,0x5a06,0x60f9,0x4eba,0x6254,0x65e5,0x8338,0x53b9,0x5982,0x5827,0x6875,0x95f0,0x82e5,0x4ee8,0x6be2,0x4e09
    ,0x6852,0x63bb,0x8272,0x68ee,0x50e7,0x6740,0x7b5b,0x5c71,0x4f24,0x5f30,0x5962,0x7533,0x5347,0x5c38,0x53ce,0x4e66,0x5237,0x6454,0x95e9,0x53cc,0x8c01,0x542e,0x5981,0x53b6,0x5fea,0x635c,0x82cf,0x72fb,0x590a,0x5b59,0x5506,0x4ed6,0x82d4,0x574d,0x94f4,0x5932,0x5fd1,0x71a5,0x5254,0x5929,0x4f7b,0x5e16,0x5385,0x56f2,0x5077,0x92c0,0x6e4d,0x63a8,0x541e,0x6258,0x6316,0x6b6a,0x5f2f,0x5c2a,0x5371,0x586d,0x7fc1,0x631d,0x5140,0x5915,0x867e,0x4eda,0x4e61,0x7071,0x4e9b,0x5fc3,0x661f,0x51f6,0x4f11,0x65f4,0x8f69,0x75b6,0x52cb,0x4e2b,0x6079,0x592e,0x5e7a,0x8036,0x4e00,0x6b2d,0x5e94,0x54df,0x4f63,0x4f18,0x625c,0x9e22,0x66f0,0x6655,0x531d,0x707d,0x7ccc,0x7242,0x50ae,0x5219,0x8d3c,0x600e,0x5897,0x5412,0x635a,0x6cbe,0x5f20,0x948a,0x8707,0x8d1e,0x4e89,0x4e4b,0x4e2d,0x5dde,0x6731,0x6293,0x8de9,0x4e13,0x5986,0x96b9,0x5b92,0x5353,0x5b5c,0x5b97,0x90b9,0x79df,0x94bb,0x539c,0x5c0a,0x6628};
       byte[][] uobyteArray = new byte[][407];
       uobyteArray[0] = new byte[6]{'A',0x00,0x00,0x00,0x00,0x00};
       uobyteArray[1] = new byte[6]{'A','I',0x00,0x00,0x00,0x00};
       uobyteArray[2] = new byte[6]{'A','N',0x00,0x00,0x00,0x00};
       uobyteArray[3] = new byte[6]{'A','N','G',0x00,0x00,0x00};
       uobyteArray[4] = new byte[6]{'A','O',0x00,0x00,0x00,0x00};
       uobyteArray[5] = new byte[6]{'B','A',0x00,0x00,0x00,0x00};
       uobyteArray[6] = new byte[6]{'B','A','I',0x00,0x00,0x00};
       uobyteArray[7] = new byte[6]{'B','A','N',0x00,0x00,0x00};
       uobyteArray[8] = new byte[6]{'B','A','N','G',0x00,0x00};
       uobyteArray[9] = new byte[6]{'B','A','O',0x00,0x00,0x00};
       uobyteArray[10] = new byte[6]{'B','E','I',0x00,0x00,0x00};
       uobyteArray[11] = new byte[6]{'B','E','N',0x00,0x00,0x00};
       uobyteArray[12] = new byte[6]{'B','E','N','G',0x00,0x00};
       uobyteArray[13] = new byte[6]{'B','I',0x00,0x00,0x00,0x00};
       uobyteArray[14] = new byte[6]{'B','I','A','N',0x00,0x00};
       uobyteArray[15] = new byte[6]{'B','I','A','O',0x00,0x00};
       uobyteArray[16] = new byte[6]{'B','I','E',0x00,0x00,0x00};
       uobyteArray[17] = new byte[6]{'B','I','N',0x00,0x00,0x00};
       uobyteArray[18] = new byte[6]{'B','I','N','G',0x00,0x00};
       uobyteArray[19] = new byte[6]{'B','O',0x00,0x00,0x00,0x00};
       uobyteArray[20] = new byte[6]{'B','U',0x00,0x00,0x00,0x00};
       uobyteArray[21] = new byte[6]{'C','A',0x00,0x00,0x00,0x00};
       uobyteArray[22] = new byte[6]{'C','A','I',0x00,0x00,0x00};
       uobyteArray[23] = new byte[6]{'C','A','N',0x00,0x00,0x00};
       uobyteArray[24] = new byte[6]{'C','A','N','G',0x00,0x00};
       uobyteArray[25] = new byte[6]{'C','A','O',0x00,0x00,0x00};
       uobyteArray[26] = new byte[6]{'C','E',0x00,0x00,0x00,0x00};
       uobyteArray[27] = new byte[6]{'C','E','N',0x00,0x00,0x00};
       uobyteArray[28] = new byte[6]{'C','E','N','G',0x00,0x00};
       uobyteArray[29] = new byte[6]{'C','H','A',0x00,0x00,0x00};
       uobyteArray[30] = new byte[6]{'C','H','A','I',0x00,0x00};
       uobyteArray[31] = new byte[6]{'C','H','A','N',0x00,0x00};
       uobyteArray[32] = new byte[6]{'C','H','A','N','G',0x00};
       uobyteArray[33] = new byte[6]{'C','H','A','O',0x00,0x00};
       uobyteArray[34] = new byte[6]{'C','H','E',0x00,0x00,0x00};
       uobyteArray[35] = new byte[6]{'C','H','E','N',0x00,0x00};
       uobyteArray[36] = new byte[6]{'C','H','E','N','G',0x00};
       uobyteArray[37] = new byte[6]{'C','H','I',0x00,0x00,0x00};
       uobyteArray[38] = new byte[6]{'C','H','O','N','G',0x00};
       uobyteArray[39] = new byte[6]{'C','H','O','U',0x00,0x00};
       uobyteArray[40] = new byte[6]{'C','H','U',0x00,0x00,0x00};
       uobyteArray[41] = new byte[6]{'C','H','U','A',0x00,0x00};
       uobyteArray[42] = new byte[6]{'C','H','U','A','I',0x00};
       uobyteArray[43] = new byte[6]{'C','H','U','A','N',0x00};
       uobyteArray[44] = new byte[6]{'C','H','U','A','N','G'};
       uobyteArray[45] = new byte[6]{'C','H','U','I',0x00,0x00};
       uobyteArray[46] = new byte[6]{'C','H','U','N',0x00,0x00};
       uobyteArray[47] = new byte[6]{'C','H','U','O',0x00,0x00};
       uobyteArray[48] = new byte[6]{'C','I',0x00,0x00,0x00,0x00};
       uobyteArray[49] = new byte[6]{'C','O','N','G',0x00,0x00};
       uobyteArray[50] = new byte[6]{'C','O','U',0x00,0x00,0x00};
       uobyteArray[51] = new byte[6]{'C','U',0x00,0x00,0x00,0x00};
       uobyteArray[52] = new byte[6]{'C','U','A','N',0x00,0x00};
       uobyteArray[53] = new byte[6]{'C','U','I',0x00,0x00,0x00};
       uobyteArray[54] = new byte[6]{'C','U','N',0x00,0x00,0x00};
       uobyteArray[55] = new byte[6]{'C','U','O',0x00,0x00,0x00};
       uobyteArray[56] = new byte[6]{'D','A',0x00,0x00,0x00,0x00};
       uobyteArray[57] = new byte[6]{'D','A','I',0x00,0x00,0x00};
       uobyteArray[58] = new byte[6]{'D','A','N',0x00,0x00,0x00};
       uobyteArray[59] = new byte[6]{'D','A','N','G',0x00,0x00};
       uobyteArray[60] = new byte[6]{'D','A','O',0x00,0x00,0x00};
       uobyteArray[61] = new byte[6]{'D','E',0x00,0x00,0x00,0x00};
       uobyteArray[62] = new byte[6]{'D','E','I',0x00,0x00,0x00};
       uobyteArray[63] = new byte[6]{'D','E','N',0x00,0x00,0x00};
       uobyteArray[64] = new byte[6]{'D','E','N','G',0x00,0x00};
       uobyteArray[65] = new byte[6]{'D','I',0x00,0x00,0x00,0x00};
       uobyteArray[66] = new byte[6]{'D','I','A',0x00,0x00,0x00};
       uobyteArray[67] = new byte[6]{'D','I','A','N',0x00,0x00};
       uobyteArray[68] = new byte[6]{'D','I','A','O',0x00,0x00};
       uobyteArray[69] = new byte[6]{'D','I','E',0x00,0x00,0x00};
       uobyteArray[70] = new byte[6]{'D','I','N','G',0x00,0x00};
       uobyteArray[71] = new byte[6]{'D','I','U',0x00,0x00,0x00};
       uobyteArray[72] = new byte[6]{'D','O','N','G',0x00,0x00};
       uobyteArray[73] = new byte[6]{'D','O','U',0x00,0x00,0x00};
       uobyteArray[74] = new byte[6]{'D','U',0x00,0x00,0x00,0x00};
       uobyteArray[75] = new byte[6]{'D','U','A','N',0x00,0x00};
       uobyteArray[76] = new byte[6]{'D','U','I',0x00,0x00,0x00};
       uobyteArray[77] = new byte[6]{'D','U','N',0x00,0x00,0x00};
       uobyteArray[78] = new byte[6]{'D','U','O',0x00,0x00,0x00};
       uobyteArray[79] = new byte[6]{'E',0x00,0x00,0x00,0x00,0x00};
       uobyteArray[80] = new byte[6]{'E','I',0x00,0x00,0x00,0x00};
       uobyteArray[81] = new byte[6]{'E','N',0x00,0x00,0x00,0x00};
       uobyteArray[82] = new byte[6]{'E','N','G',0x00,0x00,0x00};
       uobyteArray[83] = new byte[6]{'E','R',0x00,0x00,0x00,0x00};
       uobyteArray[84] = new byte[6]{'F','A',0x00,0x00,0x00,0x00};
       uobyteArray[85] = new byte[6]{'F','A','N',0x00,0x00,0x00};
       uobyteArray[86] = new byte[6]{'F','A','N','G',0x00,0x00};
       uobyteArray[87] = new byte[6]{'F','E','I',0x00,0x00,0x00};
       uobyteArray[88] = new byte[6]{'F','E','N',0x00,0x00,0x00};
       uobyteArray[89] = new byte[6]{'F','E','N','G',0x00,0x00};
       uobyteArray[90] = new byte[6]{'F','I','A','O',0x00,0x00};
       uobyteArray[91] = new byte[6]{'F','O',0x00,0x00,0x00,0x00};
       uobyteArray[92] = new byte[6]{'F','O','U',0x00,0x00,0x00};
       uobyteArray[93] = new byte[6]{'F','U',0x00,0x00,0x00,0x00};
       uobyteArray[94] = new byte[6]{'G','A',0x00,0x00,0x00,0x00};
       uobyteArray[95] = new byte[6]{'G','A','I',0x00,0x00,0x00};
       uobyteArray[96] = new byte[6]{'G','A','N',0x00,0x00,0x00};
       uobyteArray[97] = new byte[6]{'G','A','N','G',0x00,0x00};
       uobyteArray[98] = new byte[6]{'G','A','O',0x00,0x00,0x00};
       uobyteArray[99] = new byte[6]{'G','E',0x00,0x00,0x00,0x00};
       uobyteArray[100] = new byte[6]{'G','E','I',0x00,0x00,0x00};
       uobyteArray[101] = new byte[6]{'G','E','N',0x00,0x00,0x00};
       uobyteArray[102] = new byte[6]{'G','E','N','G',0x00,0x00};
       uobyteArray[103] = new byte[6]{'G','O','N','G',0x00,0x00};
       uobyteArray[104] = new byte[6]{'G','O','U',0x00,0x00,0x00};
       uobyteArray[105] = new byte[6]{'G','U',0x00,0x00,0x00,0x00};
       uobyteArray[106] = new byte[6]{'G','U','A',0x00,0x00,0x00};
       uobyteArray[107] = new byte[6]{'G','U','A','I',0x00,0x00};
       uobyteArray[108] = new byte[6]{'G','U','A','N',0x00,0x00};
       uobyteArray[109] = new byte[6]{'G','U','A','N','G',0x00};
       uobyteArray[110] = new byte[6]{'G','U','I',0x00,0x00,0x00};
       uobyteArray[111] = new byte[6]{'G','U','N',0x00,0x00,0x00};
       uobyteArray[112] = new byte[6]{'G','U','O',0x00,0x00,0x00};
       uobyteArray[113] = new byte[6]{'H','A',0x00,0x00,0x00,0x00};
       uobyteArray[114] = new byte[6]{'H','A','I',0x00,0x00,0x00};
       uobyteArray[115] = new byte[6]{'H','A','N',0x00,0x00,0x00};
       uobyteArray[116] = new byte[6]{'H','A','N','G',0x00,0x00};
       uobyteArray[117] = new byte[6]{'H','A','O',0x00,0x00,0x00};
       uobyteArray[118] = new byte[6]{'H','E',0x00,0x00,0x00,0x00};
       uobyteArray[119] = new byte[6]{'H','E','I',0x00,0x00,0x00};
       uobyteArray[120] = new byte[6]{'H','E','N',0x00,0x00,0x00};
       uobyteArray[121] = new byte[6]{'H','E','N','G',0x00,0x00};
       uobyteArray[122] = new byte[6]{'H','M',0x00,0x00,0x00,0x00};
       uobyteArray[123] = new byte[6]{'H','O','N','G',0x00,0x00};
       uobyteArray[124] = new byte[6]{'H','O','U',0x00,0x00,0x00};
       uobyteArray[125] = new byte[6]{'H','U',0x00,0x00,0x00,0x00};
       uobyteArray[126] = new byte[6]{'H','U','A',0x00,0x00,0x00};
       uobyteArray[127] = new byte[6]{'H','U','A','I',0x00,0x00};
       uobyteArray[128] = new byte[6]{'H','U','A','N',0x00,0x00};
       uobyteArray[129] = new byte[6]{'H','U','A','N','G',0x00};
       uobyteArray[130] = new byte[6]{'H','U','I',0x00,0x00,0x00};
       uobyteArray[131] = new byte[6]{'H','U','N',0x00,0x00,0x00};
       uobyteArray[132] = new byte[6]{'H','U','O',0x00,0x00,0x00};
       uobyteArray[133] = new byte[6]{'J','I',0x00,0x00,0x00,0x00};
       uobyteArray[134] = new byte[6]{'J','I','A',0x00,0x00,0x00};
       uobyteArray[135] = new byte[6]{'J','I','A','N',0x00,0x00};
       uobyteArray[136] = new byte[6]{'J','I','A','N','G',0x00};
       uobyteArray[137] = new byte[6]{'J','I','A','O',0x00,0x00};
       uobyteArray[138] = new byte[6]{'J','I','E',0x00,0x00,0x00};
       uobyteArray[139] = new byte[6]{'J','I','N',0x00,0x00,0x00};
       uobyteArray[140] = new byte[6]{'J','I','N','G',0x00,0x00};
       uobyteArray[141] = new byte[6]{'J','I','O','N','G',0x00};
       uobyteArray[142] = new byte[6]{'J','I','U',0x00,0x00,0x00};
       uobyteArray[143] = new byte[6]{'J','U',0x00,0x00,0x00,0x00};
       uobyteArray[144] = new byte[6]{'J','U','A','N',0x00,0x00};
       uobyteArray[145] = new byte[6]{'J','U','E',0x00,0x00,0x00};
       uobyteArray[146] = new byte[6]{'J','U','N',0x00,0x00,0x00};
       uobyteArray[147] = new byte[6]{'K','A',0x00,0x00,0x00,0x00};
       uobyteArray[148] = new byte[6]{'K','A','I',0x00,0x00,0x00};
       uobyteArray[149] = new byte[6]{'K','A','N',0x00,0x00,0x00};
       uobyteArray[150] = new byte[6]{'K','A','N','G',0x00,0x00};
       uobyteArray[151] = new byte[6]{'K','A','O',0x00,0x00,0x00};
       uobyteArray[152] = new byte[6]{'K','E',0x00,0x00,0x00,0x00};
       uobyteArray[153] = new byte[6]{'K','E','I',0x00,0x00,0x00};
       uobyteArray[154] = new byte[6]{'K','E','N',0x00,0x00,0x00};
       uobyteArray[155] = new byte[6]{'K','E','N','G',0x00,0x00};
       uobyteArray[156] = new byte[6]{'K','O','N','G',0x00,0x00};
       uobyteArray[157] = new byte[6]{'K','O','U',0x00,0x00,0x00};
       uobyteArray[158] = new byte[6]{'K','U',0x00,0x00,0x00,0x00};
       uobyteArray[159] = new byte[6]{'K','U','A',0x00,0x00,0x00};
       uobyteArray[160] = new byte[6]{'K','U','A','I',0x00,0x00};
       uobyteArray[161] = new byte[6]{'K','U','A','N',0x00,0x00};
       uobyteArray[162] = new byte[6]{'K','U','A','N','G',0x00};
       uobyteArray[163] = new byte[6]{'K','U','I',0x00,0x00,0x00};
       uobyteArray[164] = new byte[6]{'K','U','N',0x00,0x00,0x00};
       uobyteArray[165] = new byte[6]{'K','U','O',0x00,0x00,0x00};
       uobyteArray[166] = new byte[6]{'L','A',0x00,0x00,0x00,0x00};
       uobyteArray[167] = new byte[6]{'L','A','I',0x00,0x00,0x00};
       uobyteArray[168] = new byte[6]{'L','A','N',0x00,0x00,0x00};
       uobyteArray[169] = new byte[6]{'L','A','N','G',0x00,0x00};
       uobyteArray[170] = new byte[6]{'L','A','O',0x00,0x00,0x00};
       uobyteArray[171] = new byte[6]{'L','E',0x00,0x00,0x00,0x00};
       uobyteArray[172] = new byte[6]{'L','E','I',0x00,0x00,0x00};
       uobyteArray[173] = new byte[6]{'L','E','N','G',0x00,0x00};
       uobyteArray[174] = new byte[6]{'L','I',0x00,0x00,0x00,0x00};
       uobyteArray[175] = new byte[6]{'L','I','A',0x00,0x00,0x00};
       uobyteArray[176] = new byte[6]{'L','I','A','N',0x00,0x00};
       uobyteArray[177] = new byte[6]{'L','I','A','N','G',0x00};
       uobyteArray[178] = new byte[6]{'L','I','A','O',0x00,0x00};
       uobyteArray[179] = new byte[6]{'L','I','E',0x00,0x00,0x00};
       uobyteArray[180] = new byte[6]{'L','I','N',0x00,0x00,0x00};
       uobyteArray[181] = new byte[6]{'L','I','N','G',0x00,0x00};
       uobyteArray[182] = new byte[6]{'L','I','U',0x00,0x00,0x00};
       uobyteArray[183] = new byte[6]{'L','O','N','G',0x00,0x00};
       uobyteArray[184] = new byte[6]{'L','O','U',0x00,0x00,0x00};
       uobyteArray[185] = new byte[6]{'L','U',0x00,0x00,0x00,0x00};
       uobyteArray[186] = new byte[6]{'L','U','A','N',0x00,0x00};
       uobyteArray[187] = new byte[6]{'L','U','E',0x00,0x00,0x00};
       uobyteArray[188] = new byte[6]{'L','U','N',0x00,0x00,0x00};
       uobyteArray[189] = new byte[6]{'L','U','O',0x00,0x00,0x00};
       uobyteArray[190] = new byte[6]{'M',0x00,0x00,0x00,0x00,0x00};
       uobyteArray[191] = new byte[6]{'M','A',0x00,0x00,0x00,0x00};
       uobyteArray[192] = new byte[6]{'M','A','I',0x00,0x00,0x00};
       uobyteArray[193] = new byte[6]{'M','A','N',0x00,0x00,0x00};
       uobyteArray[194] = new byte[6]{'M','A','N','G',0x00,0x00};
       uobyteArray[195] = new byte[6]{'M','A','O',0x00,0x00,0x00};
       uobyteArray[196] = new byte[6]{'M','E',0x00,0x00,0x00,0x00};
       uobyteArray[197] = new byte[6]{'M','E','I',0x00,0x00,0x00};
       uobyteArray[198] = new byte[6]{'M','E','N',0x00,0x00,0x00};
       uobyteArray[199] = new byte[6]{'M','E','N','G',0x00,0x00};
       uobyteArray[200] = new byte[6]{'M','I',0x00,0x00,0x00,0x00};
       uobyteArray[201] = new byte[6]{'M','I','A','N',0x00,0x00};
       uobyteArray[202] = new byte[6]{'M','I','A','O',0x00,0x00};
       uobyteArray[203] = new byte[6]{'M','I','E',0x00,0x00,0x00};
       uobyteArray[204] = new byte[6]{'M','I','N',0x00,0x00,0x00};
       uobyteArray[205] = new byte[6]{'M','I','N','G',0x00,0x00};
       uobyteArray[206] = new byte[6]{'M','I','U',0x00,0x00,0x00};
       uobyteArray[207] = new byte[6]{'M','O',0x00,0x00,0x00,0x00};
       uobyteArray[208] = new byte[6]{'M','O','U',0x00,0x00,0x00};
       uobyteArray[209] = new byte[6]{'M','U',0x00,0x00,0x00,0x00};
       uobyteArray[210] = new byte[6]{'N','A',0x00,0x00,0x00,0x00};
       uobyteArray[211] = new byte[6]{'N','A','I',0x00,0x00,0x00};
       uobyteArray[212] = new byte[6]{'N','A','N',0x00,0x00,0x00};
       uobyteArray[213] = new byte[6]{'N','A','N','G',0x00,0x00};
       uobyteArray[214] = new byte[6]{'N','A','O',0x00,0x00,0x00};
       uobyteArray[215] = new byte[6]{'N','E',0x00,0x00,0x00,0x00};
       uobyteArray[216] = new byte[6]{'N','E','I',0x00,0x00,0x00};
       uobyteArray[217] = new byte[6]{'N','E','N',0x00,0x00,0x00};
       uobyteArray[218] = new byte[6]{'N','E','N','G',0x00,0x00};
       uobyteArray[219] = new byte[6]{'N','I',0x00,0x00,0x00,0x00};
       uobyteArray[220] = new byte[6]{'N','I','A','N',0x00,0x00};
       uobyteArray[221] = new byte[6]{'N','I','A','N','G',0x00};
       uobyteArray[222] = new byte[6]{'N','I','A','O',0x00,0x00};
       uobyteArray[223] = new byte[6]{'N','I','E',0x00,0x00,0x00};
       uobyteArray[224] = new byte[6]{'N','I','N',0x00,0x00,0x00};
       uobyteArray[225] = new byte[6]{'N','I','N','G',0x00,0x00};
       uobyteArray[226] = new byte[6]{'N','I','U',0x00,0x00,0x00};
       uobyteArray[227] = new byte[6]{'N','O','N','G',0x00,0x00};
       uobyteArray[228] = new byte[6]{'N','O','U',0x00,0x00,0x00};
       uobyteArray[229] = new byte[6]{'N','U',0x00,0x00,0x00,0x00};
       uobyteArray[230] = new byte[6]{'N','U','A','N',0x00,0x00};
       uobyteArray[231] = new byte[6]{'N','U','E',0x00,0x00,0x00};
       uobyteArray[232] = new byte[6]{'N','U','O',0x00,0x00,0x00};
       uobyteArray[233] = new byte[6]{'O',0x00,0x00,0x00,0x00,0x00};
       uobyteArray[234] = new byte[6]{'O','U',0x00,0x00,0x00,0x00};
       uobyteArray[235] = new byte[6]{'P','A',0x00,0x00,0x00,0x00};
       uobyteArray[236] = new byte[6]{'P','A','I',0x00,0x00,0x00};
       uobyteArray[237] = new byte[6]{'P','A','N',0x00,0x00,0x00};
       uobyteArray[238] = new byte[6]{'P','A','N','G',0x00,0x00};
       uobyteArray[239] = new byte[6]{'P','A','O',0x00,0x00,0x00};
       uobyteArray[240] = new byte[6]{'P','E','I',0x00,0x00,0x00};
       uobyteArray[241] = new byte[6]{'P','E','N',0x00,0x00,0x00};
       uobyteArray[242] = new byte[6]{'P','E','N','G',0x00,0x00};
       uobyteArray[243] = new byte[6]{'P','I',0x00,0x00,0x00,0x00};
       uobyteArray[244] = new byte[6]{'P','I','A','N',0x00,0x00};
       uobyteArray[245] = new byte[6]{'P','I','A','O',0x00,0x00};
       uobyteArray[246] = new byte[6]{'P','I','E',0x00,0x00,0x00};
       uobyteArray[247] = new byte[6]{'P','I','N',0x00,0x00,0x00};
       uobyteArray[248] = new byte[6]{'P','I','N','G',0x00,0x00};
       uobyteArray[249] = new byte[6]{'P','O',0x00,0x00,0x00,0x00};
       uobyteArray[250] = new byte[6]{'P','O','U',0x00,0x00,0x00};
       uobyteArray[251] = new byte[6]{'P','U',0x00,0x00,0x00,0x00};
       uobyteArray[252] = new byte[6]{'Q','I',0x00,0x00,0x00,0x00};
       uobyteArray[253] = new byte[6]{'Q','I','A',0x00,0x00,0x00};
       uobyteArray[254] = new byte[6]{'Q','I','A','N',0x00,0x00};
       uobyteArray[255] = new byte[6]{'Q','I','A','N','G',0x00};
       uobyteArray[256] = new byte[6]{'Q','I','A','O',0x00,0x00};
       uobyteArray[257] = new byte[6]{'Q','I','E',0x00,0x00,0x00};
       uobyteArray[258] = new byte[6]{'Q','I','N',0x00,0x00,0x00};
       uobyteArray[259] = new byte[6]{'Q','I','N','G',0x00,0x00};
       uobyteArray[260] = new byte[6]{'Q','I','O','N','G',0x00};
       uobyteArray[261] = new byte[6]{'Q','I','U',0x00,0x00,0x00};
       uobyteArray[262] = new byte[6]{'Q','U',0x00,0x00,0x00,0x00};
       uobyteArray[263] = new byte[6]{'Q','U','A','N',0x00,0x00};
       uobyteArray[264] = new byte[6]{'Q','U','E',0x00,0x00,0x00};
       uobyteArray[265] = new byte[6]{'Q','U','N',0x00,0x00,0x00};
       uobyteArray[266] = new byte[6]{'R','A','N',0x00,0x00,0x00};
       uobyteArray[267] = new byte[6]{'R','A','N','G',0x00,0x00};
       uobyteArray[268] = new byte[6]{'R','A','O',0x00,0x00,0x00};
       uobyteArray[269] = new byte[6]{'R','E',0x00,0x00,0x00,0x00};
       uobyteArray[270] = new byte[6]{'R','E','N',0x00,0x00,0x00};
       uobyteArray[271] = new byte[6]{'R','E','N','G',0x00,0x00};
       uobyteArray[272] = new byte[6]{'R','I',0x00,0x00,0x00,0x00};
       uobyteArray[273] = new byte[6]{'R','O','N','G',0x00,0x00};
       uobyteArray[274] = new byte[6]{'R','O','U',0x00,0x00,0x00};
       uobyteArray[275] = new byte[6]{'R','U',0x00,0x00,0x00,0x00};
       uobyteArray[276] = new byte[6]{'R','U','A','N',0x00,0x00};
       uobyteArray[277] = new byte[6]{'R','U','I',0x00,0x00,0x00};
       uobyteArray[278] = new byte[6]{'R','U','N',0x00,0x00,0x00};
       uobyteArray[279] = new byte[6]{'R','U','O',0x00,0x00,0x00};
       uobyteArray[280] = new byte[6]{'S','A',0x00,0x00,0x00,0x00};
       uobyteArray[281] = new byte[6]{'S','A','I',0x00,0x00,0x00};
       uobyteArray[282] = new byte[6]{'S','A','N',0x00,0x00,0x00};
       uobyteArray[283] = new byte[6]{'S','A','N','G',0x00,0x00};
       uobyteArray[284] = new byte[6]{'S','A','O',0x00,0x00,0x00};
       uobyteArray[285] = new byte[6]{'S','E',0x00,0x00,0x00,0x00};
       uobyteArray[286] = new byte[6]{'S','E','N',0x00,0x00,0x00};
       uobyteArray[287] = new byte[6]{'S','E','N','G',0x00,0x00};
       uobyteArray[288] = new byte[6]{'S','H','A',0x00,0x00,0x00};
       uobyteArray[289] = new byte[6]{'S','H','A','I',0x00,0x00};
       uobyteArray[290] = new byte[6]{'S','H','A','N',0x00,0x00};
       uobyteArray[291] = new byte[6]{'S','H','A','N','G',0x00};
       uobyteArray[292] = new byte[6]{'S','H','A','O',0x00,0x00};
       uobyteArray[293] = new byte[6]{'S','H','E',0x00,0x00,0x00};
       uobyteArray[294] = new byte[6]{'S','H','E','N',0x00,0x00};
       uobyteArray[295] = new byte[6]{'S','H','E','N','G',0x00};
       uobyteArray[296] = new byte[6]{'S','H','I',0x00,0x00,0x00};
       uobyteArray[297] = new byte[6]{'S','H','O','U',0x00,0x00};
       uobyteArray[298] = new byte[6]{'S','H','U',0x00,0x00,0x00};
       uobyteArray[299] = new byte[6]{'S','H','U','A',0x00,0x00};
       uobyteArray[300] = new byte[6]{'S','H','U','A','I',0x00};
       uobyteArray[301] = new byte[6]{'S','H','U','A','N',0x00};
       uobyteArray[302] = new byte[6]{'S','H','U','A','N','G'};
       uobyteArray[303] = new byte[6]{'S','H','U','I',0x00,0x00};
       uobyteArray[304] = new byte[6]{'S','H','U','N',0x00,0x00};
       uobyteArray[305] = new byte[6]{'S','H','U','O',0x00,0x00};
       uobyteArray[306] = new byte[6]{'S','I',0x00,0x00,0x00,0x00};
       uobyteArray[307] = new byte[6]{'S','O','N','G',0x00,0x00};
       uobyteArray[308] = new byte[6]{'S','O','U',0x00,0x00,0x00};
       uobyteArray[309] = new byte[6]{'S','U',0x00,0x00,0x00,0x00};
       uobyteArray[310] = new byte[6]{'S','U','A','N',0x00,0x00};
       uobyteArray[311] = new byte[6]{'S','U','I',0x00,0x00,0x00};
       uobyteArray[312] = new byte[6]{'S','U','N',0x00,0x00,0x00};
       uobyteArray[313] = new byte[6]{'S','U','O',0x00,0x00,0x00};
       uobyteArray[314] = new byte[6]{'T','A',0x00,0x00,0x00,0x00};
       uobyteArray[315] = new byte[6]{'T','A','I',0x00,0x00,0x00};
       uobyteArray[316] = new byte[6]{'T','A','N',0x00,0x00,0x00};
       uobyteArray[317] = new byte[6]{'T','A','N','G',0x00,0x00};
       uobyteArray[318] = new byte[6]{'T','A','O',0x00,0x00,0x00};
       uobyteArray[319] = new byte[6]{'T','E',0x00,0x00,0x00,0x00};
       uobyteArray[320] = new byte[6]{'T','E','N','G',0x00,0x00};
       uobyteArray[321] = new byte[6]{'T','I',0x00,0x00,0x00,0x00};
       uobyteArray[322] = new byte[6]{'T','I','A','N',0x00,0x00};
       uobyteArray[323] = new byte[6]{'T','I','A','O',0x00,0x00};
       uobyteArray[324] = new byte[6]{'T','I','E',0x00,0x00,0x00};
       uobyteArray[325] = new byte[6]{'T','I','N','G',0x00,0x00};
       uobyteArray[326] = new byte[6]{'T','O','N','G',0x00,0x00};
       uobyteArray[327] = new byte[6]{'T','O','U',0x00,0x00,0x00};
       uobyteArray[328] = new byte[6]{'T','U',0x00,0x00,0x00,0x00};
       uobyteArray[329] = new byte[6]{'T','U','A','N',0x00,0x00};
       uobyteArray[330] = new byte[6]{'T','U','I',0x00,0x00,0x00};
       uobyteArray[331] = new byte[6]{'T','U','N',0x00,0x00,0x00};
       uobyteArray[332] = new byte[6]{'T','U','O',0x00,0x00,0x00};
       uobyteArray[333] = new byte[6]{'W','A',0x00,0x00,0x00,0x00};
       uobyteArray[334] = new byte[6]{'W','A','I',0x00,0x00,0x00};
       uobyteArray[335] = new byte[6]{'W','A','N',0x00,0x00,0x00};
       uobyteArray[336] = new byte[6]{'W','A','N','G',0x00,0x00};
       uobyteArray[337] = new byte[6]{'W','E','I',0x00,0x00,0x00};
       uobyteArray[338] = new byte[6]{'W','E','N',0x00,0x00,0x00};
       uobyteArray[339] = new byte[6]{'W','E','N','G',0x00,0x00};
       uobyteArray[340] = new byte[6]{'W','O',0x00,0x00,0x00,0x00};
       uobyteArray[341] = new byte[6]{'W','U',0x00,0x00,0x00,0x00};
       uobyteArray[342] = new byte[6]{'X','I',0x00,0x00,0x00,0x00};
       uobyteArray[343] = new byte[6]{'X','I','A',0x00,0x00,0x00};
       uobyteArray[344] = new byte[6]{'X','I','A','N',0x00,0x00};
       uobyteArray[345] = new byte[6]{'X','I','A','N','G',0x00};
       uobyteArray[346] = new byte[6]{'X','I','A','O',0x00,0x00};
       uobyteArray[347] = new byte[6]{'X','I','E',0x00,0x00,0x00};
       uobyteArray[348] = new byte[6]{'X','I','N',0x00,0x00,0x00};
       uobyteArray[349] = new byte[6]{'X','I','N','G',0x00,0x00};
       uobyteArray[350] = new byte[6]{'X','I','O','N','G',0x00};
       uobyteArray[351] = new byte[6]{'X','I','U',0x00,0x00,0x00};
       uobyteArray[352] = new byte[6]{'X','U',0x00,0x00,0x00,0x00};
       uobyteArray[353] = new byte[6]{'X','U','A','N',0x00,0x00};
       uobyteArray[354] = new byte[6]{'X','U','E',0x00,0x00,0x00};
       uobyteArray[355] = new byte[6]{'X','U','N',0x00,0x00,0x00};
       uobyteArray[356] = new byte[6]{'Y','A',0x00,0x00,0x00,0x00};
       uobyteArray[357] = new byte[6]{'Y','A','N',0x00,0x00,0x00};
       uobyteArray[358] = new byte[6]{'Y','A','N','G',0x00,0x00};
       uobyteArray[359] = new byte[6]{'Y','A','O',0x00,0x00,0x00};
       uobyteArray[360] = new byte[6]{'Y','E',0x00,0x00,0x00,0x00};
       uobyteArray[361] = new byte[6]{'Y','I',0x00,0x00,0x00,0x00};
       uobyteArray[362] = new byte[6]{'Y','I','N',0x00,0x00,0x00};
       uobyteArray[363] = new byte[6]{'Y','I','N','G',0x00,0x00};
       uobyteArray[364] = new byte[6]{'Y','O',0x00,0x00,0x00,0x00};
       uobyteArray[365] = new byte[6]{'Y','O','N','G',0x00,0x00};
       uobyteArray[366] = new byte[6]{'Y','O','U',0x00,0x00,0x00};
       uobyteArray[367] = new byte[6]{'Y','U',0x00,0x00,0x00,0x00};
       uobyteArray[368] = new byte[6]{'Y','U','A','N',0x00,0x00};
       uobyteArray[369] = new byte[6]{'Y','U','E',0x00,0x00,0x00};
       uobyteArray[370] = new byte[6]{'Y','U','N',0x00,0x00,0x00};
       uobyteArray[371] = new byte[6]{'Z','A',0x00,0x00,0x00,0x00};
       uobyteArray[372] = new byte[6]{'Z','A','I',0x00,0x00,0x00};
       uobyteArray[373] = new byte[6]{'Z','A','N',0x00,0x00,0x00};
       uobyteArray[374] = new byte[6]{'Z','A','N','G',0x00,0x00};
       uobyteArray[375] = new byte[6]{'Z','A','O',0x00,0x00,0x00};
       uobyteArray[376] = new byte[6]{'Z','E',0x00,0x00,0x00,0x00};
       uobyteArray[377] = new byte[6]{'Z','E','I',0x00,0x00,0x00};
       uobyteArray[378] = new byte[6]{'Z','E','N',0x00,0x00,0x00};
       uobyteArray[379] = new byte[6]{'Z','E','N','G',0x00,0x00};
       uobyteArray[380] = new byte[6]{'Z','H','A',0x00,0x00,0x00};
       uobyteArray[381] = new byte[6]{'Z','H','A','I',0x00,0x00};
       uobyteArray[382] = new byte[6]{'Z','H','A','N',0x00,0x00};
       uobyteArray[383] = new byte[6]{'Z','H','A','N','G',0x00};
       uobyteArray[384] = new byte[6]{'Z','H','A','O',0x00,0x00};
       uobyteArray[385] = new byte[6]{'Z','H','E',0x00,0x00,0x00};
       uobyteArray[386] = new byte[6]{'Z','H','E','N',0x00,0x00};
       uobyteArray[387] = new byte[6]{'Z','H','E','N','G',0x00};
       uobyteArray[388] = new byte[6]{'Z','H','I',0x00,0x00,0x00};
       uobyteArray[389] = new byte[6]{'Z','H','O','N','G',0x00};
       uobyteArray[390] = new byte[6]{'Z','H','O','U',0x00,0x00};
       uobyteArray[391] = new byte[6]{'Z','H','U',0x00,0x00,0x00};
       uobyteArray[392] = new byte[6]{'Z','H','U','A',0x00,0x00};
       uobyteArray[393] = new byte[6]{'Z','H','U','A','I',0x00};
       uobyteArray[394] = new byte[6]{'Z','H','U','A','N',0x00};
       uobyteArray[395] = new byte[6]{'Z','H','U','A','N','G'};
       uobyteArray[396] = new byte[6]{'Z','H','U','I',0x00,0x00};
       uobyteArray[397] = new byte[6]{'Z','H','U','N',0x00,0x00};
       uobyteArray[398] = new byte[6]{'Z','H','U','O',0x00,0x00};
       uobyteArray[399] = new byte[6]{'Z','I',0x00,0x00,0x00,0x00};
       uobyteArray[400] = new byte[6]{'Z','O','N','G',0x00,0x00};
       uobyteArray[401] = new byte[6]{'Z','O','U',0x00,0x00,0x00};
       uobyteArray[402] = new byte[6]{'Z','U',0x00,0x00,0x00,0x00};
       uobyteArray[403] = new byte[6]{'Z','U','A','N',0x00,0x00};
       uobyteArray[404] = new byte[6]{'Z','U','I',0x00,0x00,0x00};
       uobyteArray[405] = new byte[6]{'Z','U','N',0x00,0x00,0x00};
       uobyteArray[406] = new byte[6]{'Z','U','O',0x00,0x00,0x00};
       f0.c = uobyteArray;
       f0.d = Collator.getInstance(Locale.CHINA);
    }
    public void f0(boolean p0){
       super();
       this.a = p0;
    }
    public static synchronized f0 c(){
       _monitor_enter(f0.class);
       f0 e = f0.e;
       if (e != null) {
          _monitor_exit(f0.class);
          return e;
       }else {
          int i = 0;
          boolean b = (Collator.getInstance(Locale.SIMPLIFIED_CHINESE) != null)? true: false;
          if (!b) {
             Locale[] availableLoc = Collator.getAvailableLocales();
             int len = availableLoc.length;
             while (i < len) {
                if (SystemUtil.G(availableLoc[i])) {
                   b = true;
                }
                i = i + 1;
             }
          }
          if (!b) {
             Log.n("HanziToPinyin", "There is no Chinese collator, HanziToPinyin is disabled");
          }
          f0 uof0 = new f0(b);
          f0.e = uof0;
          _monitor_exit(f0.class);
          return uof0;
       }
    }
    public static String d(String p0){
       if (TextUtils.isEmpty(p0)) {
          return "";
       }
       if (f0.c().a == null) {
          return p0;
       }
       try{
          ArrayList uArrayList = f0.c().b(p0);
          StringBuilder str = "";
          if (uArrayList.size() > 0) {
             Iterator iterator = uArrayList.iterator();
             while (iterator.hasNext()) {
                f0$a uoa = iterator.next();
                if (2 == uoa.a) {
                   str = str+uoa.c;
                }else {
                   str = str+uoa.b;
                }
             }
          }
          p0 = n0.d(str);
          return p0;
       }catch(java.lang.Exception e0){
       }
    }
    public static String e(String p0){
       if (TextUtils.isEmpty(p0)) {
          return "";
       }
       if (f0.c().a == null) {
          return p0;
       }
       try{
          ArrayList uArrayList = f0.c().b(p0);
          StringBuilder str = "";
          if (uArrayList.size() > 0) {
             Iterator iterator = uArrayList.iterator();
             while (iterator.hasNext()) {
                f0$a uoa = iterator.next();
                if (2 == uoa.a && !TextUtils.isEmpty(uoa.c)) {
                   str = str+(uoa.c).substring(0, 1);
                }else {
                   str = str+uoa.b;
                }
             }
          }
          p0 = n0.d(str);
          return p0;
       }catch(java.lang.Exception e0){
       }
    }
    public final void a(StringBuilder p0,ArrayList p1,int p2){
       p1.add(new f0$a(p2, p0, p0));
       p0.setLength(0);
    }
    public ArrayList b(String p0){
       f0 uof0 = this;
       ArrayList uArrayList = new ArrayList();
       if (uof0.a != null && !TextUtils.isEmpty(p0)) {
          int i = p0.length();
          StringBuilder str = "";
          int i1 = 1;
          int i2 = 0;
          int i3 = 1;
          while (i2 < i) {
             char c = (p0).charAt(i2);
             int i4 = 2;
             int i5 = 3;
             if (c == ' ') {
                if (str.length() > 0) {
                   uof0.a(str, uArrayList, i3);
                }
             }else {
                int i6 = 256;
                if (c < i6) {
                   if (i3 != i1 && str.length() > 0) {
                      uof0.a(str, uArrayList, i3);
                   }
                   str = str+c;
                   i3 = 1;
                }else {
                   String str1 = 0x3400;
                   if (c < str1) {
                      if (i3 != i5 && str.length() > 0) {
                         uof0.a(str, uArrayList, i3);
                      }
                      str = str+c;
                      i3 = 3;
                   }else {
                      f0$a uoa = new f0$a();
                      String str2 = Character.toString(c);
                      uoa.b = str2;
                      if (c < i6) {
                         uoa.a = i1;
                         uoa.c = str2;
                      }else if(c < str1){
                         uoa.a = i5;
                         uoa.c = str2;
                      }else {
                         Collator d = f0.d;
                         int i7 = d.compare(str2, "°¢");
                         if (i7 < 0) {
                            uoa.a = i5;
                            uoa.c = str2;
                         }else if(!i7){
                            uoa.a = i4;
                            i6 = 0;
                         }else {
                            i7 = d.compare(str2, "É");
                            if (i7 > 0) {
                               uoa.a = i5;
                               uoa.c = str2;
                            }else if(!i7){
                               uoa.a = i4;
                               i6 = f0.b.length - i1;
                            }else {
                               i6 = -1;
                            }
                         }
                         uoa.a = i4;
                         if (i6 < 0) {
                            int i8 = f0.b.length - i1;
                            i1 = 0;
                            while (i1 <= i8) {
                               i6 = i1 + i8;
                               i6 = i6 / i4;
                               i7 = f0.d.compare(str2, Character.toString(f0.b[i6]));
                               if (i7) {
                                  if (i7 > 0) {
                                     i1 = i6 + 1;
                                  }else {
                                     i8 = i6 - 1;
                                  }
                                  i4 = 2;
                               }
                            }
                         }
                         if (i7 < 0) {
                            i6 = i6 - 1;
                         }
                         if (i6 < 0 || i6 >= f0.c.length) {
                            uoa.a = i5;
                            uoa.c = str2;
                         }else {
                            StringBuilder str3 = "";
                            i1 = 0;
                            byte[][] c1 = f0.c;
                            while (i1 < c1[i6].length && c1[i6][i1]) {
                               str3 = str3+(char)c1[i6][i1];
                               i1 = i1 + 1;
                            }
                            uoa.c = str3;
                         }
                      }
                      f0$a a = uoa.a;
                      if (a == 2) {
                         if (str.length() > 0) {
                            uof0.a(str, uArrayList, i3);
                         }
                         uArrayList.add(uoa);
                         i3 = 2;
                      }else if(i3 != a && str.length() > 0){
                         uof0.a(str, uArrayList, i3);
                      }
                      i3 = uoa.a;
                      str = str+c;
                   }
                }
             }
             i2 = i2 + 1;
             i1 = 1;
          }
          if (str.length() > 0) {
             uof0.a(str, uArrayList, i3);
          }
       }
       return uArrayList;
    }
}
