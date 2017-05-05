package com.sgcc.cpu;

/**
 * @Author: Zhiheng Su
 * @Data: 2017/5/4.
 * @Description:    不同手机cpu架构的获取帮助类，一般用途为三方的.so库体积太大，
 *                  如果考虑到兼容的话，就需要将不同架构的.so库都要导入进去，大大增加了app
 *                  的体积，影响了用户的体验，可以考虑动态获取用户手机cpu的架构，然后从服务器下载
 *                  对应的.so库的压缩包到sd卡上，解压后加载，可以大大减少apk的体积
 */
/*
 * Copyright (C) 2010 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
public class CPUFrameworkHelper {
    static {
        System.loadLibrary("native-lib");
    }
    public static final String ARMEABI_V7 = "armeabi-v7a";
    public static final String ARMEABI = "armeabi";
    public static final String MIPSABI = "mips";
    public static final  String X86ABI = "x86";

    public static native boolean isArmCpu();
    public static native boolean isArm7Compatible();
    public static native boolean isMipsCpu();
    public static native boolean isX86Cpu();
    public static native boolean isArm64Cpu();
    public static native boolean isMips64Cpu();
    public static native boolean isX86_64Cpu();
}