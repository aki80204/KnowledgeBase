---
category: AWS_Architecture
source: TechStock_SAA
tags:
  - aws
  - architecture
  - certification
created: 2026-02-24
---

## 1. 一言で言うと？
オンプレミスのストレージシステムとAWSストレージサービス間のデータ転送を高速化、自動化、簡素化するマネージドサービス。

## 2. 特性
データ転送タスクごとに帯域幅の上限を設定する機能がある。
移行元として、オンプレミスのWindowsファイルサーバー(SMB共有)、移行先として、[[Amzon Fsx for Windows File Server]]をサポートする。また、NTFS権限(所有者・DACL/SACL)やファイルのメタデータコピーにも対応できる。

## 3.他機能との対比
