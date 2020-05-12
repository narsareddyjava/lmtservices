/*

USE [JAVA]

IF NOT EXISTS (SELECT * FROM sysobjects WHERE name='oauth_access_token' AND xtype='U')

CREATE TABLE [dbo].[oauth_access_token](
	[token_id] [varchar](255) NULL,
	[token] [varbinary](max) NULL,
	[authentication_id] [varchar](255) NOT NULL,
	[user_name] [varchar](255) NULL,
	[client_id] [varchar](255) NULL,
	[authentication] [varbinary](max) NULL,
	[refresh_token] [varchar](255) NULL,
PRIMARY KEY CLUSTERED 
(
	[authentication_id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]


IF NOT EXISTS (SELECT * FROM sysobjects WHERE name='oauth_refresh_token' AND xtype='U')

CREATE TABLE [dbo].[oauth_refresh_token](
	[token_id] [varchar](255) NULL,
	[token] [varbinary](max) NULL,
	[authentication] [varbinary](max) NULL
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]


*/