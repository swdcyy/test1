package okhttp3.CipherSuite;
import okhttp3.CipherSuite$1;
import java.util.LinkedHashMap;
import java.lang.String;
import java.lang.Object;
import java.util.Objects;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.lang.StringBuilder;

public final class CipherSuite	// class@002067
{
    public final String javaName;
    public static final Map INSTANCES;
    public static final Comparator ORDER_BY_NAME;
    public static final CipherSuite TLS_AES_128_CCM_SHA256;
    public static final CipherSuite TLS_AES_128_GCM_SHA256;
    public static final CipherSuite TLS_AES_256_CCM_8_SHA256;
    public static final CipherSuite TLS_AES_256_GCM_SHA384;
    public static final CipherSuite TLS_CHACHA20_POLY1305_SHA256;
    public static final CipherSuite TLS_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA;
    public static final CipherSuite TLS_DHE_DSS_WITH_3DES_EDE_CBC_SHA;
    public static final CipherSuite TLS_DHE_DSS_WITH_AES_128_CBC_SHA;
    public static final CipherSuite TLS_DHE_DSS_WITH_AES_128_CBC_SHA256;
    public static final CipherSuite TLS_DHE_DSS_WITH_AES_128_GCM_SHA256;
    public static final CipherSuite TLS_DHE_DSS_WITH_AES_256_CBC_SHA;
    public static final CipherSuite TLS_DHE_DSS_WITH_AES_256_CBC_SHA256;
    public static final CipherSuite TLS_DHE_DSS_WITH_AES_256_GCM_SHA384;
    public static final CipherSuite TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA;
    public static final CipherSuite TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA;
    public static final CipherSuite TLS_DHE_DSS_WITH_DES_CBC_SHA;
    public static final CipherSuite TLS_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA;
    public static final CipherSuite TLS_DHE_RSA_WITH_3DES_EDE_CBC_SHA;
    public static final CipherSuite TLS_DHE_RSA_WITH_AES_128_CBC_SHA;
    public static final CipherSuite TLS_DHE_RSA_WITH_AES_128_CBC_SHA256;
    public static final CipherSuite TLS_DHE_RSA_WITH_AES_128_GCM_SHA256;
    public static final CipherSuite TLS_DHE_RSA_WITH_AES_256_CBC_SHA;
    public static final CipherSuite TLS_DHE_RSA_WITH_AES_256_CBC_SHA256;
    public static final CipherSuite TLS_DHE_RSA_WITH_AES_256_GCM_SHA384;
    public static final CipherSuite TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA;
    public static final CipherSuite TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA;
    public static final CipherSuite TLS_DHE_RSA_WITH_CHACHA20_POLY1305_SHA256;
    public static final CipherSuite TLS_DHE_RSA_WITH_DES_CBC_SHA;
    public static final CipherSuite TLS_DH_anon_EXPORT_WITH_DES40_CBC_SHA;
    public static final CipherSuite TLS_DH_anon_EXPORT_WITH_RC4_40_MD5;
    public static final CipherSuite TLS_DH_anon_WITH_3DES_EDE_CBC_SHA;
    public static final CipherSuite TLS_DH_anon_WITH_AES_128_CBC_SHA;
    public static final CipherSuite TLS_DH_anon_WITH_AES_128_CBC_SHA256;
    public static final CipherSuite TLS_DH_anon_WITH_AES_128_GCM_SHA256;
    public static final CipherSuite TLS_DH_anon_WITH_AES_256_CBC_SHA;
    public static final CipherSuite TLS_DH_anon_WITH_AES_256_CBC_SHA256;
    public static final CipherSuite TLS_DH_anon_WITH_AES_256_GCM_SHA384;
    public static final CipherSuite TLS_DH_anon_WITH_DES_CBC_SHA;
    public static final CipherSuite TLS_DH_anon_WITH_RC4_128_MD5;
    public static final CipherSuite TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA;
    public static final CipherSuite TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA;
    public static final CipherSuite TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256;
    public static final CipherSuite TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256;
    public static final CipherSuite TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA;
    public static final CipherSuite TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384;
    public static final CipherSuite TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384;
    public static final CipherSuite TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256;
    public static final CipherSuite TLS_ECDHE_ECDSA_WITH_NULL_SHA;
    public static final CipherSuite TLS_ECDHE_ECDSA_WITH_RC4_128_SHA;
    public static final CipherSuite TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA;
    public static final CipherSuite TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA;
    public static final CipherSuite TLS_ECDHE_PSK_WITH_CHACHA20_POLY1305_SHA256;
    public static final CipherSuite TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA;
    public static final CipherSuite TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA;
    public static final CipherSuite TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256;
    public static final CipherSuite TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256;
    public static final CipherSuite TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA;
    public static final CipherSuite TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384;
    public static final CipherSuite TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384;
    public static final CipherSuite TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256;
    public static final CipherSuite TLS_ECDHE_RSA_WITH_NULL_SHA;
    public static final CipherSuite TLS_ECDHE_RSA_WITH_RC4_128_SHA;
    public static final CipherSuite TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA;
    public static final CipherSuite TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA;
    public static final CipherSuite TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256;
    public static final CipherSuite TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256;
    public static final CipherSuite TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA;
    public static final CipherSuite TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384;
    public static final CipherSuite TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384;
    public static final CipherSuite TLS_ECDH_ECDSA_WITH_NULL_SHA;
    public static final CipherSuite TLS_ECDH_ECDSA_WITH_RC4_128_SHA;
    public static final CipherSuite TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA;
    public static final CipherSuite TLS_ECDH_RSA_WITH_AES_128_CBC_SHA;
    public static final CipherSuite TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256;
    public static final CipherSuite TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256;
    public static final CipherSuite TLS_ECDH_RSA_WITH_AES_256_CBC_SHA;
    public static final CipherSuite TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384;
    public static final CipherSuite TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384;
    public static final CipherSuite TLS_ECDH_RSA_WITH_NULL_SHA;
    public static final CipherSuite TLS_ECDH_RSA_WITH_RC4_128_SHA;
    public static final CipherSuite TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA;
    public static final CipherSuite TLS_ECDH_anon_WITH_AES_128_CBC_SHA;
    public static final CipherSuite TLS_ECDH_anon_WITH_AES_256_CBC_SHA;
    public static final CipherSuite TLS_ECDH_anon_WITH_NULL_SHA;
    public static final CipherSuite TLS_ECDH_anon_WITH_RC4_128_SHA;
    public static final CipherSuite TLS_EMPTY_RENEGOTIATION_INFO_SCSV;
    public static final CipherSuite TLS_FALLBACK_SCSV;
    public static final CipherSuite TLS_KRB5_EXPORT_WITH_DES_CBC_40_MD5;
    public static final CipherSuite TLS_KRB5_EXPORT_WITH_DES_CBC_40_SHA;
    public static final CipherSuite TLS_KRB5_EXPORT_WITH_RC4_40_MD5;
    public static final CipherSuite TLS_KRB5_EXPORT_WITH_RC4_40_SHA;
    public static final CipherSuite TLS_KRB5_WITH_3DES_EDE_CBC_MD5;
    public static final CipherSuite TLS_KRB5_WITH_3DES_EDE_CBC_SHA;
    public static final CipherSuite TLS_KRB5_WITH_DES_CBC_MD5;
    public static final CipherSuite TLS_KRB5_WITH_DES_CBC_SHA;
    public static final CipherSuite TLS_KRB5_WITH_RC4_128_MD5;
    public static final CipherSuite TLS_KRB5_WITH_RC4_128_SHA;
    public static final CipherSuite TLS_PSK_WITH_3DES_EDE_CBC_SHA;
    public static final CipherSuite TLS_PSK_WITH_AES_128_CBC_SHA;
    public static final CipherSuite TLS_PSK_WITH_AES_256_CBC_SHA;
    public static final CipherSuite TLS_PSK_WITH_RC4_128_SHA;
    public static final CipherSuite TLS_RSA_EXPORT_WITH_DES40_CBC_SHA;
    public static final CipherSuite TLS_RSA_EXPORT_WITH_RC4_40_MD5;
    public static final CipherSuite TLS_RSA_WITH_3DES_EDE_CBC_SHA;
    public static final CipherSuite TLS_RSA_WITH_AES_128_CBC_SHA;
    public static final CipherSuite TLS_RSA_WITH_AES_128_CBC_SHA256;
    public static final CipherSuite TLS_RSA_WITH_AES_128_GCM_SHA256;
    public static final CipherSuite TLS_RSA_WITH_AES_256_CBC_SHA;
    public static final CipherSuite TLS_RSA_WITH_AES_256_CBC_SHA256;
    public static final CipherSuite TLS_RSA_WITH_AES_256_GCM_SHA384;
    public static final CipherSuite TLS_RSA_WITH_CAMELLIA_128_CBC_SHA;
    public static final CipherSuite TLS_RSA_WITH_CAMELLIA_256_CBC_SHA;
    public static final CipherSuite TLS_RSA_WITH_DES_CBC_SHA;
    public static final CipherSuite TLS_RSA_WITH_NULL_MD5;
    public static final CipherSuite TLS_RSA_WITH_NULL_SHA;
    public static final CipherSuite TLS_RSA_WITH_NULL_SHA256;
    public static final CipherSuite TLS_RSA_WITH_RC4_128_MD5;
    public static final CipherSuite TLS_RSA_WITH_RC4_128_SHA;
    public static final CipherSuite TLS_RSA_WITH_SEED_CBC_SHA;

    static {
       CipherSuite.ORDER_BY_NAME = new CipherSuite$1();
       CipherSuite.INSTANCES = new LinkedHashMap();
       CipherSuite.TLS_RSA_WITH_NULL_MD5 = CipherSuite.init("SSL_RSA_WITH_NULL_MD5", 1);
       CipherSuite.TLS_RSA_WITH_NULL_SHA = CipherSuite.init("SSL_RSA_WITH_NULL_SHA", 2);
       CipherSuite.TLS_RSA_EXPORT_WITH_RC4_40_MD5 = CipherSuite.init("SSL_RSA_EXPORT_WITH_RC4_40_MD5", 3);
       CipherSuite.TLS_RSA_WITH_RC4_128_MD5 = CipherSuite.init("SSL_RSA_WITH_RC4_128_MD5", 4);
       CipherSuite.TLS_RSA_WITH_RC4_128_SHA = CipherSuite.init("SSL_RSA_WITH_RC4_128_SHA", 5);
       CipherSuite.TLS_RSA_EXPORT_WITH_DES40_CBC_SHA = CipherSuite.init("SSL_RSA_EXPORT_WITH_DES40_CBC_SHA", 8);
       CipherSuite.TLS_RSA_WITH_DES_CBC_SHA = CipherSuite.init("SSL_RSA_WITH_DES_CBC_SHA", 9);
       CipherSuite.TLS_RSA_WITH_3DES_EDE_CBC_SHA = CipherSuite.init("SSL_RSA_WITH_3DES_EDE_CBC_SHA", 10);
       CipherSuite.TLS_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA = CipherSuite.init("SSL_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA", 17);
       CipherSuite.TLS_DHE_DSS_WITH_DES_CBC_SHA = CipherSuite.init("SSL_DHE_DSS_WITH_DES_CBC_SHA", 18);
       CipherSuite.TLS_DHE_DSS_WITH_3DES_EDE_CBC_SHA = CipherSuite.init("SSL_DHE_DSS_WITH_3DES_EDE_CBC_SHA", 19);
       CipherSuite.TLS_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA = CipherSuite.init("SSL_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA", 20);
       CipherSuite.TLS_DHE_RSA_WITH_DES_CBC_SHA = CipherSuite.init("SSL_DHE_RSA_WITH_DES_CBC_SHA", 21);
       CipherSuite.TLS_DHE_RSA_WITH_3DES_EDE_CBC_SHA = CipherSuite.init("SSL_DHE_RSA_WITH_3DES_EDE_CBC_SHA", 22);
       CipherSuite.TLS_DH_anon_EXPORT_WITH_RC4_40_MD5 = CipherSuite.init("SSL_DH_anon_EXPORT_WITH_RC4_40_MD5", 23);
       CipherSuite.TLS_DH_anon_WITH_RC4_128_MD5 = CipherSuite.init("SSL_DH_anon_WITH_RC4_128_MD5", 24);
       CipherSuite.TLS_DH_anon_EXPORT_WITH_DES40_CBC_SHA = CipherSuite.init("SSL_DH_anon_EXPORT_WITH_DES40_CBC_SHA", 25);
       CipherSuite.TLS_DH_anon_WITH_DES_CBC_SHA = CipherSuite.init("SSL_DH_anon_WITH_DES_CBC_SHA", 26);
       CipherSuite.TLS_DH_anon_WITH_3DES_EDE_CBC_SHA = CipherSuite.init("SSL_DH_anon_WITH_3DES_EDE_CBC_SHA", 27);
       CipherSuite.TLS_KRB5_WITH_DES_CBC_SHA = CipherSuite.init("TLS_KRB5_WITH_DES_CBC_SHA", 30);
       CipherSuite.TLS_KRB5_WITH_3DES_EDE_CBC_SHA = CipherSuite.init("TLS_KRB5_WITH_3DES_EDE_CBC_SHA", 31);
       CipherSuite.TLS_KRB5_WITH_RC4_128_SHA = CipherSuite.init("TLS_KRB5_WITH_RC4_128_SHA", 32);
       CipherSuite.TLS_KRB5_WITH_DES_CBC_MD5 = CipherSuite.init("TLS_KRB5_WITH_DES_CBC_MD5", 34);
       CipherSuite.TLS_KRB5_WITH_3DES_EDE_CBC_MD5 = CipherSuite.init("TLS_KRB5_WITH_3DES_EDE_CBC_MD5", 35);
       CipherSuite.TLS_KRB5_WITH_RC4_128_MD5 = CipherSuite.init("TLS_KRB5_WITH_RC4_128_MD5", 36);
       CipherSuite.TLS_KRB5_EXPORT_WITH_DES_CBC_40_SHA = CipherSuite.init("TLS_KRB5_EXPORT_WITH_DES_CBC_40_SHA", 38);
       CipherSuite.TLS_KRB5_EXPORT_WITH_RC4_40_SHA = CipherSuite.init("TLS_KRB5_EXPORT_WITH_RC4_40_SHA", 40);
       CipherSuite.TLS_KRB5_EXPORT_WITH_DES_CBC_40_MD5 = CipherSuite.init("TLS_KRB5_EXPORT_WITH_DES_CBC_40_MD5", 41);
       CipherSuite.TLS_KRB5_EXPORT_WITH_RC4_40_MD5 = CipherSuite.init("TLS_KRB5_EXPORT_WITH_RC4_40_MD5", 43);
       CipherSuite.TLS_RSA_WITH_AES_128_CBC_SHA = CipherSuite.init("TLS_RSA_WITH_AES_128_CBC_SHA", 47);
       CipherSuite.TLS_DHE_DSS_WITH_AES_128_CBC_SHA = CipherSuite.init("TLS_DHE_DSS_WITH_AES_128_CBC_SHA", 50);
       CipherSuite.TLS_DHE_RSA_WITH_AES_128_CBC_SHA = CipherSuite.init("TLS_DHE_RSA_WITH_AES_128_CBC_SHA", 51);
       CipherSuite.TLS_DH_anon_WITH_AES_128_CBC_SHA = CipherSuite.init("TLS_DH_anon_WITH_AES_128_CBC_SHA", 52);
       CipherSuite.TLS_RSA_WITH_AES_256_CBC_SHA = CipherSuite.init("TLS_RSA_WITH_AES_256_CBC_SHA", 53);
       CipherSuite.TLS_DHE_DSS_WITH_AES_256_CBC_SHA = CipherSuite.init("TLS_DHE_DSS_WITH_AES_256_CBC_SHA", 56);
       CipherSuite.TLS_DHE_RSA_WITH_AES_256_CBC_SHA = CipherSuite.init("TLS_DHE_RSA_WITH_AES_256_CBC_SHA", 57);
       CipherSuite.TLS_DH_anon_WITH_AES_256_CBC_SHA = CipherSuite.init("TLS_DH_anon_WITH_AES_256_CBC_SHA", 58);
       CipherSuite.TLS_RSA_WITH_NULL_SHA256 = CipherSuite.init("TLS_RSA_WITH_NULL_SHA256", 59);
       CipherSuite.TLS_RSA_WITH_AES_128_CBC_SHA256 = CipherSuite.init("TLS_RSA_WITH_AES_128_CBC_SHA256", 60);
       CipherSuite.TLS_RSA_WITH_AES_256_CBC_SHA256 = CipherSuite.init("TLS_RSA_WITH_AES_256_CBC_SHA256", 61);
       CipherSuite.TLS_DHE_DSS_WITH_AES_128_CBC_SHA256 = CipherSuite.init("TLS_DHE_DSS_WITH_AES_128_CBC_SHA256", 64);
       CipherSuite.TLS_RSA_WITH_CAMELLIA_128_CBC_SHA = CipherSuite.init("TLS_RSA_WITH_CAMELLIA_128_CBC_SHA", 65);
       CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA = CipherSuite.init("TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA", 68);
       CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA = CipherSuite.init("TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA", 69);
       CipherSuite.TLS_DHE_RSA_WITH_AES_128_CBC_SHA256 = CipherSuite.init("TLS_DHE_RSA_WITH_AES_128_CBC_SHA256", 103);
       CipherSuite.TLS_DHE_DSS_WITH_AES_256_CBC_SHA256 = CipherSuite.init("TLS_DHE_DSS_WITH_AES_256_CBC_SHA256", 106);
       CipherSuite.TLS_DHE_RSA_WITH_AES_256_CBC_SHA256 = CipherSuite.init("TLS_DHE_RSA_WITH_AES_256_CBC_SHA256", 107);
       CipherSuite.TLS_DH_anon_WITH_AES_128_CBC_SHA256 = CipherSuite.init("TLS_DH_anon_WITH_AES_128_CBC_SHA256", 108);
       CipherSuite.TLS_DH_anon_WITH_AES_256_CBC_SHA256 = CipherSuite.init("TLS_DH_anon_WITH_AES_256_CBC_SHA256", 109);
       CipherSuite.TLS_RSA_WITH_CAMELLIA_256_CBC_SHA = CipherSuite.init("TLS_RSA_WITH_CAMELLIA_256_CBC_SHA", 132);
       CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA = CipherSuite.init("TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA", 135);
       CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA = CipherSuite.init("TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA", 136);
       CipherSuite.TLS_PSK_WITH_RC4_128_SHA = CipherSuite.init("TLS_PSK_WITH_RC4_128_SHA", 138);
       CipherSuite.TLS_PSK_WITH_3DES_EDE_CBC_SHA = CipherSuite.init("TLS_PSK_WITH_3DES_EDE_CBC_SHA", 139);
       CipherSuite.TLS_PSK_WITH_AES_128_CBC_SHA = CipherSuite.init("TLS_PSK_WITH_AES_128_CBC_SHA", 140);
       CipherSuite.TLS_PSK_WITH_AES_256_CBC_SHA = CipherSuite.init("TLS_PSK_WITH_AES_256_CBC_SHA", 141);
       CipherSuite.TLS_RSA_WITH_SEED_CBC_SHA = CipherSuite.init("TLS_RSA_WITH_SEED_CBC_SHA", 150);
       CipherSuite.TLS_RSA_WITH_AES_128_GCM_SHA256 = CipherSuite.init("TLS_RSA_WITH_AES_128_GCM_SHA256", 156);
       CipherSuite.TLS_RSA_WITH_AES_256_GCM_SHA384 = CipherSuite.init("TLS_RSA_WITH_AES_256_GCM_SHA384", 157);
       CipherSuite.TLS_DHE_RSA_WITH_AES_128_GCM_SHA256 = CipherSuite.init("TLS_DHE_RSA_WITH_AES_128_GCM_SHA256", 158);
       CipherSuite.TLS_DHE_RSA_WITH_AES_256_GCM_SHA384 = CipherSuite.init("TLS_DHE_RSA_WITH_AES_256_GCM_SHA384", 159);
       CipherSuite.TLS_DHE_DSS_WITH_AES_128_GCM_SHA256 = CipherSuite.init("TLS_DHE_DSS_WITH_AES_128_GCM_SHA256", 162);
       CipherSuite.TLS_DHE_DSS_WITH_AES_256_GCM_SHA384 = CipherSuite.init("TLS_DHE_DSS_WITH_AES_256_GCM_SHA384", 163);
       CipherSuite.TLS_DH_anon_WITH_AES_128_GCM_SHA256 = CipherSuite.init("TLS_DH_anon_WITH_AES_128_GCM_SHA256", 166);
       CipherSuite.TLS_DH_anon_WITH_AES_256_GCM_SHA384 = CipherSuite.init("TLS_DH_anon_WITH_AES_256_GCM_SHA384", 167);
       CipherSuite.TLS_EMPTY_RENEGOTIATION_INFO_SCSV = CipherSuite.init("TLS_EMPTY_RENEGOTIATION_INFO_SCSV", 255);
       CipherSuite.TLS_FALLBACK_SCSV = CipherSuite.init("TLS_FALLBACK_SCSV", 0x5600);
       CipherSuite.TLS_ECDH_ECDSA_WITH_NULL_SHA = CipherSuite.init("TLS_ECDH_ECDSA_WITH_NULL_SHA", 0xc001);
       CipherSuite.TLS_ECDH_ECDSA_WITH_RC4_128_SHA = CipherSuite.init("TLS_ECDH_ECDSA_WITH_RC4_128_SHA", 0xc002);
       CipherSuite.TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA = CipherSuite.init("TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA", 0xc003);
       CipherSuite.TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA = CipherSuite.init("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA", 0xc004);
       CipherSuite.TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA = CipherSuite.init("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA", 0xc005);
       CipherSuite.TLS_ECDHE_ECDSA_WITH_NULL_SHA = CipherSuite.init("TLS_ECDHE_ECDSA_WITH_NULL_SHA", 0xc006);
       CipherSuite.TLS_ECDHE_ECDSA_WITH_RC4_128_SHA = CipherSuite.init("TLS_ECDHE_ECDSA_WITH_RC4_128_SHA", 0xc007);
       CipherSuite.TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA = CipherSuite.init("TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA", 0xc008);
       CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA = CipherSuite.init("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA", 0xc009);
       CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA = CipherSuite.init("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA", 0xc00a);
       CipherSuite.TLS_ECDH_RSA_WITH_NULL_SHA = CipherSuite.init("TLS_ECDH_RSA_WITH_NULL_SHA", 0xc00b);
       CipherSuite.TLS_ECDH_RSA_WITH_RC4_128_SHA = CipherSuite.init("TLS_ECDH_RSA_WITH_RC4_128_SHA", 0xc00c);
       CipherSuite.TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA = CipherSuite.init("TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA", 0xc00d);
       CipherSuite.TLS_ECDH_RSA_WITH_AES_128_CBC_SHA = CipherSuite.init("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA", 0xc00e);
       CipherSuite.TLS_ECDH_RSA_WITH_AES_256_CBC_SHA = CipherSuite.init("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA", 0xc00f);
       CipherSuite.TLS_ECDHE_RSA_WITH_NULL_SHA = CipherSuite.init("TLS_ECDHE_RSA_WITH_NULL_SHA", 0xc010);
       CipherSuite.TLS_ECDHE_RSA_WITH_RC4_128_SHA = CipherSuite.init("TLS_ECDHE_RSA_WITH_RC4_128_SHA", 0xc011);
       CipherSuite.TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA = CipherSuite.init("TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA", 0xc012);
       CipherSuite.TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA = CipherSuite.init("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA", 0xc013);
       CipherSuite.TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA = CipherSuite.init("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA", 0xc014);
       CipherSuite.TLS_ECDH_anon_WITH_NULL_SHA = CipherSuite.init("TLS_ECDH_anon_WITH_NULL_SHA", 0xc015);
       CipherSuite.TLS_ECDH_anon_WITH_RC4_128_SHA = CipherSuite.init("TLS_ECDH_anon_WITH_RC4_128_SHA", 0xc016);
       CipherSuite.TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA = CipherSuite.init("TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA", 0xc017);
       CipherSuite.TLS_ECDH_anon_WITH_AES_128_CBC_SHA = CipherSuite.init("TLS_ECDH_anon_WITH_AES_128_CBC_SHA", 0xc018);
       CipherSuite.TLS_ECDH_anon_WITH_AES_256_CBC_SHA = CipherSuite.init("TLS_ECDH_anon_WITH_AES_256_CBC_SHA", 0xc019);
       CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256 = CipherSuite.init("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256", 0xc023);
       CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384 = CipherSuite.init("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384", 0xc024);
       CipherSuite.TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256 = CipherSuite.init("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256", 0xc025);
       CipherSuite.TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384 = CipherSuite.init("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384", 0xc026);
       CipherSuite.TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256 = CipherSuite.init("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256", 0xc027);
       CipherSuite.TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384 = CipherSuite.init("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384", 0xc028);
       CipherSuite.TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256 = CipherSuite.init("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256", 0xc029);
       CipherSuite.TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384 = CipherSuite.init("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384", 0xc02a);
       CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256 = CipherSuite.init("TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256", 0xc02b);
       CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384 = CipherSuite.init("TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384", 0xc02c);
       CipherSuite.TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256 = CipherSuite.init("TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256", 0xc02d);
       CipherSuite.TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384 = CipherSuite.init("TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384", 0xc02e);
       CipherSuite.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256 = CipherSuite.init("TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256", 0xc02f);
       CipherSuite.TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384 = CipherSuite.init("TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384", 0xc030);
       CipherSuite.TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256 = CipherSuite.init("TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256", 0xc031);
       CipherSuite.TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384 = CipherSuite.init("TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384", 0xc032);
       CipherSuite.TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA = CipherSuite.init("TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA", 0xc035);
       CipherSuite.TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA = CipherSuite.init("TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA", 0xc036);
       CipherSuite.TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256 = CipherSuite.init("TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256", 0xcca8);
       CipherSuite.TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256 = CipherSuite.init("TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256", 0xcca9);
       CipherSuite.TLS_DHE_RSA_WITH_CHACHA20_POLY1305_SHA256 = CipherSuite.init("TLS_DHE_RSA_WITH_CHACHA20_POLY1305_SHA256", 0xccaa);
       CipherSuite.TLS_ECDHE_PSK_WITH_CHACHA20_POLY1305_SHA256 = CipherSuite.init("TLS_ECDHE_PSK_WITH_CHACHA20_POLY1305_SHA256", 0xccac);
       CipherSuite.TLS_AES_128_GCM_SHA256 = CipherSuite.init("TLS_AES_128_GCM_SHA256", 4865);
       CipherSuite.TLS_AES_256_GCM_SHA384 = CipherSuite.init("TLS_AES_256_GCM_SHA384", 4866);
       CipherSuite.TLS_CHACHA20_POLY1305_SHA256 = CipherSuite.init("TLS_CHACHA20_POLY1305_SHA256", 4867);
       CipherSuite.TLS_AES_128_CCM_SHA256 = CipherSuite.init("TLS_AES_128_CCM_SHA256", 4868);
       CipherSuite.TLS_AES_256_CCM_8_SHA256 = CipherSuite.init("TLS_AES_256_CCM_8_SHA256", 4869);
    }
    public void CipherSuite(String p0){
       super();
       Objects.requireNonNull(p0);
       this.javaName = p0;
    }
    public static synchronized CipherSuite forJavaName(String p0){
       _monitor_enter(CipherSuite.class);
       Map iNSTANCES = CipherSuite.INSTANCES;
       CipherSuite uCipherSuite = iNSTANCES.get(p0);
       if (uCipherSuite == null) {
          uCipherSuite = iNSTANCES.get(CipherSuite.secondaryName(p0));
          if (uCipherSuite == null) {
             uCipherSuite = new CipherSuite(p0);
          }
          iNSTANCES.put(p0, uCipherSuite);
       }
       _monitor_exit(CipherSuite.class);
       return uCipherSuite;
    }
    public static List forJavaNames(String[] p0){
       ArrayList uArrayList = new ArrayList(p0.length);
       int len = p0.length;
       for (int i = 0; i < len; i = i + 1) {
          uArrayList.add(CipherSuite.forJavaName(p0[i]));
       }
       return Collections.unmodifiableList(uArrayList);
    }
    public static CipherSuite init(String p0,int p1){
       CipherSuite uCipherSuite = new CipherSuite(p0);
       CipherSuite.INSTANCES.put(p0, uCipherSuite);
       return uCipherSuite;
    }
    public static String secondaryName(String p0){
       String str = "TLS_";
       if (p0.startsWith(str)) {
          return "SSL_"+p0.substring(4);
       }
       if (p0.startsWith("SSL_")) {
          p0 = str+p0.substring(4);
       }
       return p0;
    }
    public String javaName(){
       return this.javaName;
    }
    public String toString(){
       return this.javaName;
    }
}
