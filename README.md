MobileGLES-Wrapper Plugin
====

> [!WARNING]
>
> **This repository may contain unreleased Dev versions**
>
> If you are a regular user, **do not use these versions**, as they may cause **serious rendering issues**.
> Please visit the release page to get the latest stable release.

This is the Android plugin project for the **MobileGLES** renderer, which wraps the [MobileGLES-Wrapper](https://github.com/EternityQwQ/MobileGLES-Wrapper/tree/main) as a Git submodule.

The plugin integrates the MobileGLES renderer into the FCL launcher, providing an OpenGL ES translation layer for running desktop GL applications on Android devices.

## Submodule

The renderer source code is managed as a Git submodule pointing to the `main` branch of:

- **Repository**: [EternityQwQ/MobileGLES-Wrapper](https://github.com/EternityQwQ/MobileGLES-Wrapper/tree/main)

To clone this repository with the submodule, run:

```bash
git clone --recursive <this-repo-url>
```

If the repository is already cloned, initialize and update the submodule:

```bash
git submodule update --init --recursive
```

To sync the submodule to the latest commit on `main`:

```bash
git submodule update --remote --recursive
```

## Build

The plugin is built with Gradle. After cloning, ensure the Android SDK and NDK are configured, then run:

```bash
./gradlew assembleRelease
```

The built APK will be located in `app/build/outputs/apk/release/`.

License
====
MobileGLES is licensed under **GNU LGPL-2.1 License**.

Please see [LICENSE](./LICENSE).

Third party components
====
Please see the [MobileGLES-Wrapper](https://github.com/EternityQwQ/MobileGLES-Wrapper/tree/main) repository for information about third party components used by the renderer.

Check signature of your release
====
This portion is a guide to help you identify if your apk is an official release.

In your Android build-tools, find `apksigner`. Then run the following command:
```bash
apksigner verify --print-certs path/to/MobileGLES-plugin.apk
```

In order that you may want to check against public key file, `pub.cer` and `pub.pem` are also provided.
You can use your utility as you like to check your apk against those files.
