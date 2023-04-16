package com.ks.ksuploader.KSUploaderCloseReason;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class KSUploaderCloseReason extends Enum	// class@000765
{
    public int value;
    public static final KSUploaderCloseReason[] $VALUES;
    public static final KSUploaderCloseReason KSUploaderCloseReason_EmptyFileIdList;
    public static final KSUploaderCloseReason KSUploaderCloseReason_EncryptConfig_Invalid;
    public static final KSUploaderCloseReason KSUploaderCloseReason_Failed;
    public static final KSUploaderCloseReason KSUploaderCloseReason_FdChangedDuringUploading;
    public static final KSUploaderCloseReason KSUploaderCloseReason_InvalidByteRange;
    public static final KSUploaderCloseReason KSUploaderCloseReason_InvalidFd;
    public static final KSUploaderCloseReason KSUploaderCloseReason_InvalidFile;
    public static final KSUploaderCloseReason KSUploaderCloseReason_IoStreamError;
    public static final KSUploaderCloseReason KSUploaderCloseReason_Ktp_FlowClosedUnexpectedly;
    public static final KSUploaderCloseReason KSUploaderCloseReason_Ktp_SessionClosedUnexpectedly;
    public static final KSUploaderCloseReason KSUploaderCloseReason_Ktp_SessionConnectTimeout;
    public static final KSUploaderCloseReason KSUploaderCloseReason_Ktp_SessionCreateFailed;
    public static final KSUploaderCloseReason KSUploaderCloseReason_Ktp_SessionIdConflict;
    public static final KSUploaderCloseReason KSUploaderCloseReason_Ktp_SessionNetworkTimeout;
    public static final KSUploaderCloseReason KSUploaderCloseReason_Ktp_SessionResetByPeer;
    public static final KSUploaderCloseReason KSUploaderCloseReason_Ktp_SessionResetByPeerActiveFlowExists;
    public static final KSUploaderCloseReason KSUploaderCloseReason_Ktp_SessionResetByPeerCloseByForce;
    public static final KSUploaderCloseReason KSUploaderCloseReason_Ktp_SessionResetByPeerCloseTimeout;
    public static final KSUploaderCloseReason KSUploaderCloseReason_Ktp_SessionResetByPeerConnectTimeout;
    public static final KSUploaderCloseReason KSUploaderCloseReason_Ktp_SessionResetByPeerConsecutiveRto;
    public static final KSUploaderCloseReason KSUploaderCloseReason_Ktp_SessionResetByPeerDupSessionId;
    public static final KSUploaderCloseReason KSUploaderCloseReason_Ktp_SessionResetByPeerIdAndMnConflict;
    public static final KSUploaderCloseReason KSUploaderCloseReason_Ktp_SessionResetByPeerNetworkTimeout;
    public static final KSUploaderCloseReason KSUploaderCloseReason_Ktp_SessionVersionMismatch;
    public static final KSUploaderCloseReason KSUploaderCloseReason_MultiInit;
    public static final KSUploaderCloseReason KSUploaderCloseReason_NoAvailableSession;
    public static final KSUploaderCloseReason KSUploaderCloseReason_PassFragByFd;
    public static final KSUploaderCloseReason KSUploaderCloseReason_PassFragByFilePath;
    public static final KSUploaderCloseReason KSUploaderCloseReason_ResponseTimeout;
    public static final KSUploaderCloseReason KSUploaderCloseReason_SDK_APICall_Failed;
    public static final KSUploaderCloseReason KSUploaderCloseReason_SDK_Failed;
    public static final KSUploaderCloseReason KSUploaderCloseReason_StoppedByUser;
    public static final KSUploaderCloseReason KSUploaderCloseReason_Tcp_AddrNotAvail;
    public static final KSUploaderCloseReason KSUploaderCloseReason_Tcp_ConnAborted;
    public static final KSUploaderCloseReason KSUploaderCloseReason_Tcp_ConnRefused;
    public static final KSUploaderCloseReason KSUploaderCloseReason_Tcp_ConnReset;
    public static final KSUploaderCloseReason KSUploaderCloseReason_Tcp_ConnectTimeOut;
    public static final KSUploaderCloseReason KSUploaderCloseReason_Tcp_Eof;
    public static final KSUploaderCloseReason KSUploaderCloseReason_Tcp_ErrOther;
    public static final KSUploaderCloseReason KSUploaderCloseReason_Tcp_ErrPipe;
    public static final KSUploaderCloseReason KSUploaderCloseReason_Tcp_ErrUnknown;
    public static final KSUploaderCloseReason KSUploaderCloseReason_Tcp_FlowClosedUnexpectedly;
    public static final KSUploaderCloseReason KSUploaderCloseReason_Tcp_HostUnreach;
    public static final KSUploaderCloseReason KSUploaderCloseReason_Tcp_NetDown;
    public static final KSUploaderCloseReason KSUploaderCloseReason_Tcp_NetUnreach;
    public static final KSUploaderCloseReason KSUploaderCloseReason_Tcp_NetworkTimeOut;
    public static final KSUploaderCloseReason KSUploaderCloseReason_Tcp_SessionClosedUnexpectedly;
    public static final KSUploaderCloseReason KSUploaderCloseReason_Tcp_SessionCreateFailed;
    public static final KSUploaderCloseReason KSUploaderCloseReason_UninitializedUpload;
    public static final KSUploaderCloseReason KSUploaderCloseReason_UploadMode_Mismatch;
    public static final KSUploaderCloseReason KSUploaderCloseReason_UploadSucceeded;

    static {
       KSUploaderCloseReason kSUploaderCl = new KSUploaderCloseReason("KSUploaderCloseReason_UploadSucceeded", 0, 0);
       KSUploaderCloseReason.KSUploaderCloseReason_UploadSucceeded = kSUploaderCl;
       KSUploaderCloseReason kSUploaderCl1 = new KSUploaderCloseReason("KSUploaderCloseReason_Failed", 1, 1);
       KSUploaderCloseReason.KSUploaderCloseReason_Failed = kSUploaderCl1;
       KSUploaderCloseReason kSUploaderCl2 = new KSUploaderCloseReason("KSUploaderCloseReason_StoppedByUser", 2, 2);
       KSUploaderCloseReason.KSUploaderCloseReason_StoppedByUser = kSUploaderCl2;
       KSUploaderCloseReason kSUploaderCl3 = new KSUploaderCloseReason("KSUploaderCloseReason_InvalidFile", 3, 3);
       KSUploaderCloseReason.KSUploaderCloseReason_InvalidFile = kSUploaderCl3;
       KSUploaderCloseReason kSUploaderCl4 = new KSUploaderCloseReason("KSUploaderCloseReason_IoStreamError", 4, 4);
       KSUploaderCloseReason.KSUploaderCloseReason_IoStreamError = kSUploaderCl4;
       KSUploaderCloseReason kSUploaderCl5 = new KSUploaderCloseReason("KSUploaderCloseReason_InvalidByteRange", 5, 5);
       KSUploaderCloseReason.KSUploaderCloseReason_InvalidByteRange = kSUploaderCl5;
       KSUploaderCloseReason kSUploaderCl6 = new KSUploaderCloseReason("KSUploaderCloseReason_PassFragByFd", 6, 6);
       KSUploaderCloseReason.KSUploaderCloseReason_PassFragByFd = kSUploaderCl6;
       KSUploaderCloseReason kSUploaderCl7 = new KSUploaderCloseReason("KSUploaderCloseReason_PassFragByFilePath", 7, 7);
       KSUploaderCloseReason.KSUploaderCloseReason_PassFragByFilePath = kSUploaderCl7;
       KSUploaderCloseReason kSUploaderCl8 = new KSUploaderCloseReason("KSUploaderCloseReason_FdChangedDuringUploading", 8, 8);
       KSUploaderCloseReason.KSUploaderCloseReason_FdChangedDuringUploading = kSUploaderCl8;
       KSUploaderCloseReason kSUploaderCl9 = new KSUploaderCloseReason("KSUploaderCloseReason_InvalidFd", 9, 9);
       KSUploaderCloseReason.KSUploaderCloseReason_InvalidFd = kSUploaderCl9;
       KSUploaderCloseReason kSUploaderCl10 = new KSUploaderCloseReason("KSUploaderCloseReason_EmptyFileIdList", 10, 10);
       KSUploaderCloseReason.KSUploaderCloseReason_EmptyFileIdList = kSUploaderCl10;
       KSUploaderCloseReason kSUploaderCl11 = new KSUploaderCloseReason("KSUploaderCloseReason_NoAvailableSession", 11, 11);
       KSUploaderCloseReason.KSUploaderCloseReason_NoAvailableSession = kSUploaderCl11;
       KSUploaderCloseReason kSUploaderCl12 = new KSUploaderCloseReason("KSUploaderCloseReason_ResponseTimeout", 12, 12);
       KSUploaderCloseReason.KSUploaderCloseReason_ResponseTimeout = kSUploaderCl12;
       KSUploaderCloseReason kSUploaderCl13 = kSUploaderCl12;
       KSUploaderCloseReason kSUploaderCl14 = new KSUploaderCloseReason("KSUploaderCloseReason_MultiInit", 13, 500);
       KSUploaderCloseReason.KSUploaderCloseReason_MultiInit = kSUploaderCl14;
       KSUploaderCloseReason kSUploaderCl15 = kSUploaderCl14;
       KSUploaderCloseReason kSUploaderCl16 = new KSUploaderCloseReason("KSUploaderCloseReason_UninitializedUpload", 14, 501);
       KSUploaderCloseReason.KSUploaderCloseReason_UninitializedUpload = kSUploaderCl16;
       KSUploaderCloseReason kSUploaderCl17 = kSUploaderCl16;
       kSUploaderCl14 = new KSUploaderCloseReason("KSUploaderCloseReason_SDK_Failed", 15, 502);
       KSUploaderCloseReason.KSUploaderCloseReason_SDK_Failed = kSUploaderCl14;
       KSUploaderCloseReason kSUploaderCl18 = kSUploaderCl14;
       kSUploaderCl16 = new KSUploaderCloseReason("KSUploaderCloseReason_SDK_APICall_Failed", 16, 503);
       KSUploaderCloseReason.KSUploaderCloseReason_SDK_APICall_Failed = kSUploaderCl16;
       KSUploaderCloseReason kSUploaderCl19 = kSUploaderCl16;
       kSUploaderCl14 = new KSUploaderCloseReason("KSUploaderCloseReason_UploadMode_Mismatch", 17, 504);
       KSUploaderCloseReason.KSUploaderCloseReason_UploadMode_Mismatch = kSUploaderCl14;
       KSUploaderCloseReason kSUploaderCl20 = kSUploaderCl14;
       kSUploaderCl16 = new KSUploaderCloseReason("KSUploaderCloseReason_EncryptConfig_Invalid", 18, 505);
       KSUploaderCloseReason.KSUploaderCloseReason_EncryptConfig_Invalid = kSUploaderCl16;
       KSUploaderCloseReason kSUploaderCl21 = kSUploaderCl16;
       kSUploaderCl14 = new KSUploaderCloseReason("KSUploaderCloseReason_Ktp_FlowClosedUnexpectedly", 19, 1000);
       KSUploaderCloseReason.KSUploaderCloseReason_Ktp_FlowClosedUnexpectedly = kSUploaderCl14;
       KSUploaderCloseReason kSUploaderCl22 = kSUploaderCl14;
       kSUploaderCl16 = new KSUploaderCloseReason("KSUploaderCloseReason_Ktp_SessionClosedUnexpectedly", 20, 1001);
       KSUploaderCloseReason.KSUploaderCloseReason_Ktp_SessionClosedUnexpectedly = kSUploaderCl16;
       KSUploaderCloseReason kSUploaderCl23 = kSUploaderCl16;
       kSUploaderCl14 = new KSUploaderCloseReason("KSUploaderCloseReason_Ktp_SessionCreateFailed", 21, 1002);
       KSUploaderCloseReason.KSUploaderCloseReason_Ktp_SessionCreateFailed = kSUploaderCl14;
       KSUploaderCloseReason kSUploaderCl24 = kSUploaderCl14;
       kSUploaderCl16 = new KSUploaderCloseReason("KSUploaderCloseReason_Ktp_SessionVersionMismatch", 22, 1003);
       KSUploaderCloseReason.KSUploaderCloseReason_Ktp_SessionVersionMismatch = kSUploaderCl16;
       KSUploaderCloseReason kSUploaderCl25 = kSUploaderCl16;
       KSUploaderCloseReason kSUploaderCl26 = new KSUploaderCloseReason("KSUploaderCloseReason_Ktp_SessionIdConflict", 23, 1004);
       KSUploaderCloseReason.KSUploaderCloseReason_Ktp_SessionIdConflict = kSUploaderCl26;
       KSUploaderCloseReason kSUploaderCl27 = kSUploaderCl26;
       kSUploaderCl16 = new KSUploaderCloseReason("KSUploaderCloseReason_Ktp_SessionConnectTimeout", 24, 1005);
       KSUploaderCloseReason.KSUploaderCloseReason_Ktp_SessionConnectTimeout = kSUploaderCl16;
       KSUploaderCloseReason kSUploaderCl28 = kSUploaderCl16;
       kSUploaderCl26 = new KSUploaderCloseReason("KSUploaderCloseReason_Ktp_SessionResetByPeer", 25, 1006);
       KSUploaderCloseReason.KSUploaderCloseReason_Ktp_SessionResetByPeer = kSUploaderCl26;
       KSUploaderCloseReason kSUploaderCl29 = kSUploaderCl26;
       kSUploaderCl16 = new KSUploaderCloseReason("KSUploaderCloseReason_Ktp_SessionNetworkTimeout", 26, 1007);
       KSUploaderCloseReason.KSUploaderCloseReason_Ktp_SessionNetworkTimeout = kSUploaderCl16;
       KSUploaderCloseReason kSUploaderCl30 = kSUploaderCl16;
       kSUploaderCl26 = new KSUploaderCloseReason("KSUploaderCloseReason_Ktp_SessionResetByPeerCloseByForce", 27, 1008);
       KSUploaderCloseReason.KSUploaderCloseReason_Ktp_SessionResetByPeerCloseByForce = kSUploaderCl26;
       KSUploaderCloseReason kSUploaderCl31 = kSUploaderCl26;
       kSUploaderCl16 = new KSUploaderCloseReason("KSUploaderCloseReason_Ktp_SessionResetByPeerConnectTimeout", 28, 1009);
       KSUploaderCloseReason.KSUploaderCloseReason_Ktp_SessionResetByPeerConnectTimeout = kSUploaderCl16;
       KSUploaderCloseReason kSUploaderCl32 = kSUploaderCl16;
       kSUploaderCl26 = new KSUploaderCloseReason("KSUploaderCloseReason_Ktp_SessionResetByPeerCloseTimeout", 29, 1010);
       KSUploaderCloseReason.KSUploaderCloseReason_Ktp_SessionResetByPeerCloseTimeout = kSUploaderCl26;
       KSUploaderCloseReason kSUploaderCl33 = kSUploaderCl26;
       kSUploaderCl16 = new KSUploaderCloseReason("KSUploaderCloseReason_Ktp_SessionResetByPeerNetworkTimeout", 30, 1011);
       KSUploaderCloseReason.KSUploaderCloseReason_Ktp_SessionResetByPeerNetworkTimeout = kSUploaderCl16;
       KSUploaderCloseReason kSUploaderCl34 = kSUploaderCl16;
       kSUploaderCl26 = new KSUploaderCloseReason("KSUploaderCloseReason_Ktp_SessionResetByPeerConsecutiveRto", 31, 1012);
       KSUploaderCloseReason.KSUploaderCloseReason_Ktp_SessionResetByPeerConsecutiveRto = kSUploaderCl26;
       KSUploaderCloseReason kSUploaderCl35 = kSUploaderCl26;
       kSUploaderCl16 = new KSUploaderCloseReason("KSUploaderCloseReason_Ktp_SessionResetByPeerIdAndMnConflict", 32, 1013);
       KSUploaderCloseReason.KSUploaderCloseReason_Ktp_SessionResetByPeerIdAndMnConflict = kSUploaderCl16;
       KSUploaderCloseReason kSUploaderCl36 = kSUploaderCl16;
       kSUploaderCl26 = new KSUploaderCloseReason("KSUploaderCloseReason_Ktp_SessionResetByPeerActiveFlowExists", 33, 1014);
       KSUploaderCloseReason.KSUploaderCloseReason_Ktp_SessionResetByPeerActiveFlowExists = kSUploaderCl26;
       KSUploaderCloseReason kSUploaderCl37 = kSUploaderCl26;
       kSUploaderCl16 = new KSUploaderCloseReason("KSUploaderCloseReason_Ktp_SessionResetByPeerDupSessionId", 34, 1015);
       KSUploaderCloseReason.KSUploaderCloseReason_Ktp_SessionResetByPeerDupSessionId = kSUploaderCl16;
       KSUploaderCloseReason kSUploaderCl38 = kSUploaderCl16;
       kSUploaderCl26 = new KSUploaderCloseReason("KSUploaderCloseReason_Tcp_FlowClosedUnexpectedly", 35, 2000);
       KSUploaderCloseReason.KSUploaderCloseReason_Tcp_FlowClosedUnexpectedly = kSUploaderCl26;
       KSUploaderCloseReason kSUploaderCl39 = kSUploaderCl26;
       kSUploaderCl16 = new KSUploaderCloseReason("KSUploaderCloseReason_Tcp_SessionClosedUnexpectedly", 36, 2001);
       KSUploaderCloseReason.KSUploaderCloseReason_Tcp_SessionClosedUnexpectedly = kSUploaderCl16;
       KSUploaderCloseReason kSUploaderCl40 = kSUploaderCl16;
       kSUploaderCl26 = new KSUploaderCloseReason("KSUploaderCloseReason_Tcp_SessionCreateFailed", 37, 2002);
       KSUploaderCloseReason.KSUploaderCloseReason_Tcp_SessionCreateFailed = kSUploaderCl26;
       KSUploaderCloseReason kSUploaderCl41 = kSUploaderCl26;
       kSUploaderCl16 = new KSUploaderCloseReason("KSUploaderCloseReason_Tcp_AddrNotAvail", 38, 2003);
       KSUploaderCloseReason.KSUploaderCloseReason_Tcp_AddrNotAvail = kSUploaderCl16;
       KSUploaderCloseReason kSUploaderCl42 = kSUploaderCl16;
       kSUploaderCl26 = new KSUploaderCloseReason("KSUploaderCloseReason_Tcp_ConnRefused", 39, 2004);
       KSUploaderCloseReason.KSUploaderCloseReason_Tcp_ConnRefused = kSUploaderCl26;
       KSUploaderCloseReason kSUploaderCl43 = kSUploaderCl26;
       kSUploaderCl16 = new KSUploaderCloseReason("KSUploaderCloseReason_Tcp_ConnAborted", 40, 2005);
       KSUploaderCloseReason.KSUploaderCloseReason_Tcp_ConnAborted = kSUploaderCl16;
       KSUploaderCloseReason kSUploaderCl44 = kSUploaderCl16;
       kSUploaderCl26 = new KSUploaderCloseReason("KSUploaderCloseReason_Tcp_ConnReset", 41, 2006);
       KSUploaderCloseReason.KSUploaderCloseReason_Tcp_ConnReset = kSUploaderCl26;
       KSUploaderCloseReason kSUploaderCl45 = kSUploaderCl26;
       kSUploaderCl16 = new KSUploaderCloseReason("KSUploaderCloseReason_Tcp_ConnectTimeOut", 42, 2007);
       KSUploaderCloseReason.KSUploaderCloseReason_Tcp_ConnectTimeOut = kSUploaderCl16;
       KSUploaderCloseReason kSUploaderCl46 = kSUploaderCl16;
       kSUploaderCl26 = new KSUploaderCloseReason("KSUploaderCloseReason_Tcp_NetworkTimeOut", 43, 2008);
       KSUploaderCloseReason.KSUploaderCloseReason_Tcp_NetworkTimeOut = kSUploaderCl26;
       KSUploaderCloseReason kSUploaderCl47 = kSUploaderCl26;
       kSUploaderCl16 = new KSUploaderCloseReason("KSUploaderCloseReason_Tcp_Eof", 44, 2009);
       KSUploaderCloseReason.KSUploaderCloseReason_Tcp_Eof = kSUploaderCl16;
       KSUploaderCloseReason kSUploaderCl48 = kSUploaderCl16;
       kSUploaderCl26 = new KSUploaderCloseReason("KSUploaderCloseReason_Tcp_ErrPipe", 45, 2010);
       KSUploaderCloseReason.KSUploaderCloseReason_Tcp_ErrPipe = kSUploaderCl26;
       KSUploaderCloseReason kSUploaderCl49 = kSUploaderCl26;
       kSUploaderCl16 = new KSUploaderCloseReason("KSUploaderCloseReason_Tcp_HostUnreach", 46, 2011);
       KSUploaderCloseReason.KSUploaderCloseReason_Tcp_HostUnreach = kSUploaderCl16;
       KSUploaderCloseReason kSUploaderCl50 = kSUploaderCl16;
       kSUploaderCl26 = new KSUploaderCloseReason("KSUploaderCloseReason_Tcp_NetDown", 47, 2012);
       KSUploaderCloseReason.KSUploaderCloseReason_Tcp_NetDown = kSUploaderCl26;
       KSUploaderCloseReason kSUploaderCl51 = kSUploaderCl26;
       kSUploaderCl16 = new KSUploaderCloseReason("KSUploaderCloseReason_Tcp_NetUnreach", 48, 2013);
       KSUploaderCloseReason.KSUploaderCloseReason_Tcp_NetUnreach = kSUploaderCl16;
       KSUploaderCloseReason kSUploaderCl52 = kSUploaderCl16;
       kSUploaderCl26 = new KSUploaderCloseReason("KSUploaderCloseReason_Tcp_ErrUnknown", 49, 2014);
       KSUploaderCloseReason.KSUploaderCloseReason_Tcp_ErrUnknown = kSUploaderCl26;
       KSUploaderCloseReason kSUploaderCl53 = kSUploaderCl26;
       kSUploaderCl16 = new KSUploaderCloseReason("KSUploaderCloseReason_Tcp_ErrOther", 50, 2015);
       KSUploaderCloseReason.KSUploaderCloseReason_Tcp_ErrOther = kSUploaderCl16;
       KSUploaderCloseReason[] kSUploaderCl54 = new KSUploaderCloseReason[51];
       kSUploaderCl54[0] = kSUploaderCl;
       kSUploaderCl54[1] = kSUploaderCl1;
       kSUploaderCl54[2] = kSUploaderCl2;
       kSUploaderCl54[3] = kSUploaderCl3;
       kSUploaderCl54[4] = kSUploaderCl4;
       kSUploaderCl54[5] = kSUploaderCl5;
       kSUploaderCl54[6] = kSUploaderCl6;
       kSUploaderCl54[7] = kSUploaderCl7;
       kSUploaderCl54[8] = kSUploaderCl8;
       kSUploaderCl54[9] = kSUploaderCl9;
       kSUploaderCl54[10] = kSUploaderCl10;
       kSUploaderCl54[11] = kSUploaderCl11;
       kSUploaderCl54[12] = kSUploaderCl13;
       kSUploaderCl54[13] = kSUploaderCl15;
       kSUploaderCl54[14] = kSUploaderCl17;
       kSUploaderCl54[15] = kSUploaderCl18;
       kSUploaderCl54[16] = kSUploaderCl19;
       kSUploaderCl54[17] = kSUploaderCl20;
       kSUploaderCl54[18] = kSUploaderCl21;
       kSUploaderCl54[19] = kSUploaderCl22;
       kSUploaderCl54[20] = kSUploaderCl23;
       kSUploaderCl54[21] = kSUploaderCl24;
       kSUploaderCl54[22] = kSUploaderCl25;
       kSUploaderCl54[23] = kSUploaderCl27;
       kSUploaderCl54[24] = kSUploaderCl28;
       kSUploaderCl54[25] = kSUploaderCl29;
       kSUploaderCl54[26] = kSUploaderCl30;
       kSUploaderCl54[27] = kSUploaderCl31;
       kSUploaderCl54[28] = kSUploaderCl32;
       kSUploaderCl54[29] = kSUploaderCl33;
       kSUploaderCl54[30] = kSUploaderCl34;
       kSUploaderCl54[31] = kSUploaderCl35;
       kSUploaderCl54[32] = kSUploaderCl36;
       kSUploaderCl54[33] = kSUploaderCl37;
       kSUploaderCl54[34] = kSUploaderCl38;
       kSUploaderCl54[35] = kSUploaderCl39;
       kSUploaderCl54[36] = kSUploaderCl40;
       kSUploaderCl54[37] = kSUploaderCl41;
       kSUploaderCl54[38] = kSUploaderCl42;
       kSUploaderCl54[39] = kSUploaderCl43;
       kSUploaderCl54[40] = kSUploaderCl44;
       kSUploaderCl54[41] = kSUploaderCl45;
       kSUploaderCl54[42] = kSUploaderCl46;
       kSUploaderCl54[43] = kSUploaderCl47;
       kSUploaderCl54[44] = kSUploaderCl48;
       kSUploaderCl54[45] = kSUploaderCl49;
       kSUploaderCl54[46] = kSUploaderCl50;
       kSUploaderCl54[47] = kSUploaderCl51;
       kSUploaderCl54[48] = kSUploaderCl52;
       kSUploaderCl54[49] = kSUploaderCl53;
       kSUploaderCl54[50] = kSUploaderCl16;
       KSUploaderCloseReason.$VALUES = kSUploaderCl54;
    }
    public void KSUploaderCloseReason(String p0,int p1,int p2){
       super(p0, p1);
       this.value = 0;
       this.value = p2;
    }
    public static KSUploaderCloseReason valueOf(int p0){
       switch (p0){
           case 0:
             return KSUploaderCloseReason.KSUploaderCloseReason_UploadSucceeded;
           case 1:
             return KSUploaderCloseReason.KSUploaderCloseReason_Failed;
           case 2:
             return KSUploaderCloseReason.KSUploaderCloseReason_StoppedByUser;
           case 3:
             return KSUploaderCloseReason.KSUploaderCloseReason_InvalidFile;
           case 4:
             return KSUploaderCloseReason.KSUploaderCloseReason_IoStreamError;
           case 5:
             return KSUploaderCloseReason.KSUploaderCloseReason_InvalidByteRange;
           case 6:
             return KSUploaderCloseReason.KSUploaderCloseReason_PassFragByFd;
           case 7:
             return KSUploaderCloseReason.KSUploaderCloseReason_PassFragByFilePath;
           case 8:
             return KSUploaderCloseReason.KSUploaderCloseReason_FdChangedDuringUploading;
           case 9:
             return KSUploaderCloseReason.KSUploaderCloseReason_InvalidFd;
           case 10:
             return KSUploaderCloseReason.KSUploaderCloseReason_EmptyFileIdList;
           case 11:
             return KSUploaderCloseReason.KSUploaderCloseReason_NoAvailableSession;
           case 12:
             return KSUploaderCloseReason.KSUploaderCloseReason_ResponseTimeout;
           default:
             switch (p0){
                 case 500:
                   return KSUploaderCloseReason.KSUploaderCloseReason_MultiInit;
                 case 501:
                   return KSUploaderCloseReason.KSUploaderCloseReason_UninitializedUpload;
                 case 502:
                   return KSUploaderCloseReason.KSUploaderCloseReason_SDK_Failed;
                 case 503:
                   return KSUploaderCloseReason.KSUploaderCloseReason_SDK_APICall_Failed;
                 case 504:
                   return KSUploaderCloseReason.KSUploaderCloseReason_UploadMode_Mismatch;
                 case 505:
                   return KSUploaderCloseReason.KSUploaderCloseReason_EncryptConfig_Invalid;
                 default:
                   switch (p0){
                       case 1000:
                         return KSUploaderCloseReason.KSUploaderCloseReason_Ktp_FlowClosedUnexpectedly;
                       case 1001:
                         return KSUploaderCloseReason.KSUploaderCloseReason_Ktp_SessionClosedUnexpectedly;
                       case 1002:
                         return KSUploaderCloseReason.KSUploaderCloseReason_Ktp_SessionCreateFailed;
                       case 1003:
                         return KSUploaderCloseReason.KSUploaderCloseReason_Ktp_SessionVersionMismatch;
                       case 1004:
                         return KSUploaderCloseReason.KSUploaderCloseReason_Ktp_SessionIdConflict;
                       case 1005:
                         return KSUploaderCloseReason.KSUploaderCloseReason_Ktp_SessionConnectTimeout;
                       case 1006:
                         return KSUploaderCloseReason.KSUploaderCloseReason_Ktp_SessionResetByPeer;
                       case 1007:
                         return KSUploaderCloseReason.KSUploaderCloseReason_Ktp_SessionNetworkTimeout;
                       case 1008:
                         return KSUploaderCloseReason.KSUploaderCloseReason_Ktp_SessionResetByPeerCloseByForce;
                       case 1009:
                         return KSUploaderCloseReason.KSUploaderCloseReason_Ktp_SessionResetByPeerConnectTimeout;
                       case 1010:
                         return KSUploaderCloseReason.KSUploaderCloseReason_Ktp_SessionResetByPeerCloseTimeout;
                       case 1011:
                         return KSUploaderCloseReason.KSUploaderCloseReason_Ktp_SessionResetByPeerNetworkTimeout;
                       case 1012:
                         return KSUploaderCloseReason.KSUploaderCloseReason_Ktp_SessionResetByPeerConsecutiveRto;
                       case 1013:
                         return KSUploaderCloseReason.KSUploaderCloseReason_Ktp_SessionResetByPeerIdAndMnConflict;
                       case 1014:
                         return KSUploaderCloseReason.KSUploaderCloseReason_Ktp_SessionResetByPeerActiveFlowExists;
                       case 1015:
                         return KSUploaderCloseReason.KSUploaderCloseReason_Ktp_SessionResetByPeerDupSessionId;
                       default:
                         switch (p0){
                             case 2000:
                               return KSUploaderCloseReason.KSUploaderCloseReason_Tcp_FlowClosedUnexpectedly;
                             case 2001:
                               return KSUploaderCloseReason.KSUploaderCloseReason_Tcp_SessionClosedUnexpectedly;
                             case 2002:
                               return KSUploaderCloseReason.KSUploaderCloseReason_Tcp_SessionCreateFailed;
                             case 2003:
                               return KSUploaderCloseReason.KSUploaderCloseReason_Tcp_AddrNotAvail;
                             case 2004:
                               return KSUploaderCloseReason.KSUploaderCloseReason_Tcp_ConnRefused;
                             case 2005:
                               return KSUploaderCloseReason.KSUploaderCloseReason_Tcp_ConnAborted;
                             case 2006:
                               return KSUploaderCloseReason.KSUploaderCloseReason_Tcp_ConnReset;
                             case 2007:
                               return KSUploaderCloseReason.KSUploaderCloseReason_Tcp_ConnectTimeOut;
                             case 2008:
                               return KSUploaderCloseReason.KSUploaderCloseReason_Tcp_NetworkTimeOut;
                             case 2009:
                               return KSUploaderCloseReason.KSUploaderCloseReason_Tcp_Eof;
                             case 2010:
                               return KSUploaderCloseReason.KSUploaderCloseReason_Tcp_ErrPipe;
                             case 2011:
                               return KSUploaderCloseReason.KSUploaderCloseReason_Tcp_HostUnreach;
                             case 2012:
                               return KSUploaderCloseReason.KSUploaderCloseReason_Tcp_NetDown;
                             case 2013:
                               return KSUploaderCloseReason.KSUploaderCloseReason_Tcp_NetUnreach;
                             case 2014:
                               return KSUploaderCloseReason.KSUploaderCloseReason_Tcp_ErrUnknown;
                             case 2015:
                               return KSUploaderCloseReason.KSUploaderCloseReason_Tcp_ErrOther;
                             default:
                               return KSUploaderCloseReason.KSUploaderCloseReason_Failed;
                         }
                   }
             }
       }
    }
    public static KSUploaderCloseReason valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, KSUploaderCloseReason.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(KSUploaderCloseReason.class, p0);
    }
    public static KSUploaderCloseReason[] values(){
       Object obj = PatchProxy.apply(null, null, KSUploaderCloseReason.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return KSUploaderCloseReason.$VALUES.clone();
    }
    public int value(){
       return this.value;
    }
}
