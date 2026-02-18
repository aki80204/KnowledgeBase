---
category: AWS_Architecture
source: TechStock_SAA
tags:
  - aws
  - architecture
  - certification
created: 2026-02-18
---

## 1. 一言で言うと？
主にVPC間やオンプレミスとのプライベート接続を集約するためのネットワークハブ。

## 2. 特性
[[Transit Gateway]]のリージョン間ぴあリングはAWS内部のリージョン間通信(バックエンド通信)を整理・集約する用途においては有効。

## 3.他機能との対比
[[Transit Gateway]]：AWS内部のネットワークハブ
[[AWS Global Accelerator]]：インターネットからのAWSへの玄関口を最適化する。