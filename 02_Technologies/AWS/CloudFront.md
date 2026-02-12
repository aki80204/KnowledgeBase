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
世界中のエッジロケーションを利用して、低遅延でコンテンツを配信する高速キャッシュサーバー（CDN）。

## 2. 特性
### オリジンアクセスコントロール(OCA)
[[CloudFront]]が[[Amazon S3]]へのアクセスをセキュアに制限する最新かつ推奨の方法。OACを使用すると、リクエストを[[SigV4]]署名付きにできるため、[[Amazon S3]]バケットは非公開のまま運用しつつ、[[CloudFront]]経由のアクセスだけを安全に許可できる。
- Q. IAMユーザーの権限を割り当てて制限できないか -> IAMユーザーは人間や外部アプリケーションがAWSAPIを呼び出すための主体であるため、[[CloudFront]]から[[Amazon S3]]のサービス間連携に当てはめる設計はできない。
- 

## 3.他機能との対比
