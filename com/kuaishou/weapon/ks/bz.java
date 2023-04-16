package com.kuaishou.weapon.ks.bz;
import java.lang.Object;
import java.lang.String;
import java.util.jar.JarFile;
import java.util.Vector;
import java.util.Enumeration;
import java.util.jar.JarEntry;
import java.util.zip.ZipEntry;
import java.io.InputStream;
import java.util.jar.Manifest;
import java.security.CodeSigner;
import java.math.BigInteger;
import java.security.cert.CertPath;
import java.util.List;
import java.util.Iterator;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.security.PublicKey;
import java.security.interfaces.RSAPublicKey;
import java.util.Locale;

public class bz	// class@001201
{

    public void bz(){
       super();
    }
    public static boolean a(String p0){
       boolean b = (!p0.endsWith(".SF") && (!p0.endsWith(".DSA") && (p0.endsWith(".RSA") || p0.endsWith(".EC"))))? true: false;
       return b;
    }
    public static int b(String p0){
       JarFile jarFile;
       int i3;
       int i4;
       int i = 0;
       boolean b = true;
       try{
          try{
             jarFile = new JarFile(p0, b);
             Vector vector = new Vector();
             int i1 = 8192;
             byte[] uobyteArray = new byte[i1];
             Enumeration uEnumeration = jarFile.entries();
             while (uEnumeration.hasMoreElements()) {
                JarEntry jarEntry = uEnumeration.nextElement();
                vector.addElement(jarEntry);
                InputStream inputStream = jarFile.getInputStream(jarEntry);
                do {
                } while (inputStream.read(uobyteArray, 0, i1) != -1);
                inputStream.close();
             }
             if (jarFile.getManifest() != null) {
                Enumeration uEnumeration1 = vector.elements();
                i1 = 0;
                while (uEnumeration1.hasMoreElements()) {
                   JarEntry jarEntry1 = uEnumeration1.nextElement();
                   String name = jarEntry1.getName();
                   CodeSigner[] codeSigners = jarEntry1.getCodeSigners();
                   int i2 = (codeSigners != null)? 1: 0;
                   i3 = (!jarEntry1.isDirectory() && (!i2 && !bz.c(name)))? 1: 0;
                   i1 = i1 | i3;
                   if (i == null && codeSigners != null) {
                      i = codeSigners;
                   }
                }
                if (i1) {
                   i4 = 3;
                   try{
                      jarFile.close();
                      return i4;
                   }catch(java.lang.Exception e0){
                   }
                }else {
                   BigInteger uBigInteger = new BigInteger("F415423F94D59866B3AD40620136CB8083368A76872B320C35046DCFE5022F0C09E2EBD81F1D1159782BA7475C0F17CA3441532F121CDA8542223C33325597BF5B6A4889E3477CD41D7C44230C8443DE088C295CBFC9247ACFBBB612C748CDFC292156D518A6EB3A6ED1032CCC749D5DF4C8FF6AB2246A12F626AE73F5E9438A7F6141F03B3EE1D6D910B23E463ED478A8A2881F447D1440DC61C70195A1F1DE899C816EBB0BF5DC2A2B508507BEEBF281AA075EB7840DE88F6EDE6C71F25CFE2612C34469E83CEAF215638D5D1C424AD7E559FF07DCDD4421A06DAA7EB95D058F07898B2B118DFC6B61E7E013F15E95EA40B1DCD36EB81145E10F441B5FEA49", 16);
                   i1 = i.length;
                   i3 = 0;
                   while (true) {
                      if (i3 < i1) {
                         Iterator iterator = i[i3].getSignerCertPath().getCertificates().iterator();
                         while (true) {
                            if (iterator.hasNext()) {
                               Certificate uCertificate = iterator.next();
                               if (uCertificate instanceof X509Certificate) {
                                  RSAPublicKey publicKey = uCertificate.getPublicKey();
                                  if (publicKey.getModulus().equals(uBigInteger) && publicKey.getPublicExponent().intValue() == 0x10001) {
                                     try{
                                        jarFile.close();
                                        break ;
                                     }catch(java.lang.Exception e0){
                                     }
                                  }
                               }
                            }else {
                               i3 = i3 + 1;
                            }
                         }
                         return 0;
                      }else {
                         i4 = 4;
                         try{
                            jarFile.close();
                            return i4;
                         }catch(java.lang.Exception e0){
                         }
                      }
                   }
                }
             }else {
                i4 = 2;
                try{
                   jarFile.close();
                   return i4;
                }catch(java.lang.Exception e0){
                }
             }
          }catch(java.lang.Exception e0){
             JarFile jarFile1 = jarFile;
             if (e0) {
                e0.close();
             }
             return b;
          }
       }catch(java.lang.Exception e0){
       }
    }
    public static boolean c(String p0){
       p0 = p0.toUpperCase(Locale.ENGLISH);
       boolean b = true;
       if (p0.equals("META-INF/MANIFEST.MF")) {
          return b;
       }
       if (!p0.startsWith("META-INF/") || !bz.a(p0)) {
          return false;
       }
       if (p0.indexOf("/") != p0.lastIndexOf("/")) {
          b = false;
       }
       return b;
    }
}
