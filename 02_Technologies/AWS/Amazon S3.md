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
高い耐久性とスケーラビリティを備え、安価にデータを保存・取得できるオブジェクトストレージ。

## 2. 特性
- バケットポリシーで[[aws:SecureTransport]]条件キーを使用し、この値がfalseのリクエストを明示的に拒否することで、HTTPS(TLS)を使用しないすべての接続をブロックできる。
- [[ACM]]で発行したSSL/TLS証明書を直接関連付ける機能は持っていない。[[Amazon S3]]のデフォルトのエンドポイントはAWSが管理する正目所を自動的に使用する。

## 3.他機能との対比
