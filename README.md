MobileGLESWrapper Plugin
====

> [!WARNING]
> **此项目完全由 ai 驱动开发**

# MobileGLESWrapper

> **注意：这是非官方版本（Unofficial Fork）**
>
> 本项目基于 [MobileGlues](https://github.com/MobileGL-Dev/MobileGlues) 修改而来，并非官方发布版本。
> 官方项目请访问：https://github.com/MobileGL-Dev/MobileGlues
>
> 本版本将项目名称及相关标识从 `MobileGlues` 修改为 `MobileGLESWrapper`，其余内容可能与官方版本存在差异。请勿向官方项目提交与本版本相关的 Issue 或 PR。

---

**MobileGLESWrapper**（原 MobileGlues，意为 "(on) Mobile, GL uses ES"）是一个运行在 OpenGL ES 3.2 之上的 GL 实现，主要面向 Minecraft: Java Edition 的运行场景。

> **注意：本项目已放弃对 OpenGL ES 3.1 及更低版本的支持，仅支持 OpenGL ES 3.2。**

> [!IMPORTANT]
> **关于 ANGLE 支持**
>
> 本 Fork 版本**不支持启用 ANGLE**。`enableANGLE` 配置项已被移除，ANGLE 后端始终处于关闭状态。如需 ANGLE 支持，请使用 [官方版本](https://github.com/MobileGL-Dev/MobileGlues)。

---

## 源码

本仓库为 Android 插件项目，渲染器**源码**位于子模块仓库：

- **源码仓库**：[EternityQwQ/MobileGLES-Wrapper](https://github.com/EternityQwQ/MobileGLES-Wrapper/tree/main)

渲染器源码以 Git submodule 形式引入，指向上述仓库的 `main` 分支。

### 克隆与子模块

克隆本仓库及子模块：

```bash
git clone --recursive <this-repo-url>
```

若已克隆本仓库，初始化并更新子模块：

```bash
git submodule update --init --recursive
```

同步子模块到 `main` 分支最新提交：

```bash
git submodule update --remote --recursive
```

## Build

插件使用 Gradle 构建。克隆后请确保已配置 Android SDK 与 NDK，然后运行：

```bash
./gradlew assembleRelease
```

构建产物位于 `app/build/outputs/apk/release/`。

License
====
MobileGLESWrapper is licensed under **GNU LGPL-2.1 License**.

Please see [LICENSE](./LICENSE).

Third party components
====
请参阅 [MobileGLES-Wrapper 源码仓库](https://github.com/EternityQwQ/MobileGLES-Wrapper/tree/main) 了解渲染器所使用的第三方组件信息。

Check signature of your release
====
本节用于帮助您识别 APK 是否为官方发布版本。

在 Android build-tools 中找到 `apksigner`，然后运行以下命令：
```bash
apksigner verify --print-certs path/to/MobileGLESWrapper-plugin.apk
```

此外，`pub.cer` 和 `pub.pem` 公钥文件也已提供，您可以使用任意工具对照这些文件校验 APK 签名。
