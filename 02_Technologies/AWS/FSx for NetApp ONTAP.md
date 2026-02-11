---
category: AWS_Architecture
source: TechStock_SAA
tags:
  - aws
  - architecture
  - certification
created: 2026-02-11
---

## 1. 一言で言うと？
[[FSx for NetApp ONTAP]]は[[SMB]]と[[NFS]]の両方のプロトコルを同時にサポートし、同じデータセットにアクセスできるマネージドサービス。Windowsクライアントからの[[SMB]]アクセスとLinuxクライアントからの[[NFS]]アクセスを単一のファイルシステム上の同じデータに対して同時に実現できる。

## 2. 特性
- Multi-AZ構成を選択することで、[[AZ]]障害に備えた冗長化を提供できる。

## 3.他機能との対比
| サービス名                           | 主なユースケース                 | サポートプロトコル       | マルチプロトコル (同時アクセス) |
| :------------------------------ | :----------------------- | :-------------- | :---------------- |
| **FSx for NetApp ONTAP**        | 汎用ファイル共有、データベース、バックアップ   | SMB, NFS, iSCSI | **はい (SMB/NFS)**  |
| **FSx for Windows File Server** | Windows ベースのアプリケーション     | SMB             | いいえ               |
| **FSx for Lustre**              | ハイパフォーマンスコンピューティング (HPC) | Lustre (POSIX)  | いいえ               |
| **Amazon EFS**                  | Linux ベースのワークロード、コンテンツ管理 | NFS             | いいえ               |